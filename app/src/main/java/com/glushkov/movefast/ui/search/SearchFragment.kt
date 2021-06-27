package com.glushkov.movefast.ui.search

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.glushkov.movefast.databinding.FragmentSearchBinding
import com.glushkov.movefast.ui.custom.PaginationScrollListener
import com.glushkov.movefast.ui.custom.PhotoListAdapter
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.lang.Exception

class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding
    private val vm: SearchViewModel by viewModel()
    private val args: SearchFragmentArgs by navArgs()

    private val photosAdapter: PhotoListAdapter by inject()

    private val pagingScrollListener = object : PaginationScrollListener() {
        override fun onLoadMore(currentPage: Int) {
            //Loading can be added here.
            vm.getListPhoto(currentPage, args.query)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialization()
    }

    private fun onPageLoaded() {
        //Loading stop can be added here.
        pagingScrollListener.increasePage()
    }

    override fun onStop() {
        super.onStop()
        photosAdapter.clear()
        pagingScrollListener.reset()
    }

    private fun initialization() {
        //Initial data request
        vm.getListPhoto(1, args.query)
        pagingScrollListener.reset()

        initListeners()

        manageList()
        initObserver()
    }

    private fun initListeners() {
        //Navigation click from item to info screen
        photosAdapter.setOnClick { id ->
            findNavController().navigate(
                SearchFragmentDirections.actionSearchFragmentToInfoFragment(
                    id
                )
            )
        }
        //Init action button for more user friendly navigation
        binding.floatingActionButton.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun initObserver() {
        //Manage received data
        vm.searchResults.observe(viewLifecycleOwner) {
            try {
                photosAdapter.addData(it.results)
                onPageLoaded()
            }
            catch (e: Exception) {
                Log.e(SearchFragment::class.java.name, "Failed search response", e)
            }
        }
    }

    private fun manageList() {
        //Manage recycler view
        binding.listPhoto.apply {
            val lManager = LinearLayoutManager(requireContext())
            layoutManager = lManager
            pagingScrollListener.addLayoutManager(lManager)
            addOnScrollListener(pagingScrollListener)
            adapter = photosAdapter
        }
    }
}