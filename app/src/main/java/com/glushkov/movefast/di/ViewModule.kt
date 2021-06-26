package com.glushkov.movefast.di

import com.glushkov.movefast.ui.custom.PhotoListAdapter
import com.glushkov.movefast.ui.home.HomeViewModel
import com.glushkov.movefast.ui.info.InfoViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        HomeViewModel(get())
    }
    viewModel {
        InfoViewModel(get())
    }

    single {
        PhotoListAdapter()
    }
}