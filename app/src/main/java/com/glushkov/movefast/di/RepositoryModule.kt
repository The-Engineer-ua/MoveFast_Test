package com.glushkov.movefast.di

import com.glushkov.movefast.repository.PhotoRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {
        PhotoRepository(get())
    }
}