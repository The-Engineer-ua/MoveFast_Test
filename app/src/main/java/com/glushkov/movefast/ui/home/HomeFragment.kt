package com.glushkov.movefast.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.glushkov.movefast.R
import com.glushkov.movefast.databinding.DialogSearchBinding
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
            //Loading can be added here.
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

    override fun onStop() {
        super.onStop()
        photosAdapter.clear()
        pagingScrollListener.reset()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initialization()
    }

    private fun onPageLoaded() {
        //Loading stop can be added here.
        pagingScrollListener.increasePage()
    }

    private fun initialization() {

        //Initial data request
        vm.getListPhoto(1)
        pagingScrollListener.reset()

        initListeners()

        initList()
        initObserver()
    }

    private fun initListeners() {
        //Navigation click from item to info screen
        photosAdapter.setOnClick { id ->
            findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToInfoFragment(
                    id
                )
            )
        }
        //Create search flow
        binding.floatingActionButton.setOnClickListener {
            showSearchDialog()
        }
    }

    private fun initList() {
        //Manage recycler view
        binding.listPhoto.apply {
            val lManager = LinearLayoutManager(requireContext())
            layoutManager = lManager
            pagingScrollListener.addLayoutManager(lManager)
            addOnScrollListener(pagingScrollListener)
            adapter = photosAdapter
        }
    }

    private fun initObserver() {
        //Manage received data
        vm.photoList.observe(viewLifecycleOwner) {
            photosAdapter.addData(it)
            onPageLoaded()
        }
    }

    private fun showSearchDialog() {
        val dialogBinding = DialogSearchBinding.inflate(layoutInflater)

        val alertDialog = AlertDialog.Builder(requireContext(), R.style.AlertDialogTheme)
            .setView(dialogBinding.root)
            .setTitle(getString(R.string.search_title))
            .setCancelable(true)
            .setPositiveButton(getString(R.string.search), null)
            .setNegativeButton(getString(R.string.cancel)) { dialog, _ ->
                dialog.cancel()
            }
            .create()
        alertDialog.setOnShowListener {
            alertDialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener {
                val query = dialogBinding.edtQuery.text.toString()
                if (query.length < 3) {
                    dialogBinding.txtHint.visibility = View.VISIBLE
                    return@setOnClickListener
                }
                findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToSearchFragment(query)
                )
                alertDialog.dismiss()

            }
        }

        alertDialog.show()
    }
}