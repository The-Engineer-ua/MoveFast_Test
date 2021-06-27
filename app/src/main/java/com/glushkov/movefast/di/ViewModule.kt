package com.glushkov.movefast.di

import com.glushkov.movefast.ui.custom.PhotoListAdapter
import com.glushkov.movefast.ui.home.HomeViewModel
import com.glushkov.movefast.ui.info.InfoViewModel
import com.glushkov.movefast.ui.search.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        HomeViewModel(get())
    }
    viewModel {
        InfoViewModel(get())
    }
    viewModel {
        SearchViewModel(get())
    }

    single {
        PhotoListAdapter()
    }
}