package com.glushkov.movefast.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.glushkov.movefast.databinding.FragmentHomeBinding
import com.glushkov.movefast.ui.custom.PaginationScrollListener
import com.glushkov.movefast.ui.custom.PhotoListAdapter
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val vm: HomeViewModel by viewModel()

    private val photosAdapter: PhotoListAdapter by inject()

    private val pagingScrollListener = object : PaginationScrollListener() {
        override fun onLoadMore(currentPage: Int) {
            //TODO - loading
            vm.getListPhoto(currentPage)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialization()
    }

    private fun onPageLoaded() {
        //TODO hide loading
        pagingScrollListener.increasePage()
    }

    private fun initialization() {
        vm.getListPhoto(1)
        pagingScrollListener.reset()

        photosAdapter.setOnClick { id ->
            findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToInfoFragment(
                    id
                )
            )
        }

        binding.listPhoto.apply {
            val lManager = LinearLayoutManager(requireContext())
            layoutManager = lManager
            pagingScrollListener.addLayoutManager(lManager)
            addOnScrollListener(pagingScrollListener)
            adapter = photosAdapter
        }

        vm.photoList.observe(viewLifecycleOwner) {
            photosAdapter.addData(it)
            onPageLoaded()
        }
    }
}