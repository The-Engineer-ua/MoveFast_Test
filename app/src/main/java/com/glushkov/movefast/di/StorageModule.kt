package com.glushkov.movefast.di

import com.glushkov.movefast.data.AppData
import org.koin.dsl.module

val storageModule = module {
    single {
        AppData(get())
    }
}