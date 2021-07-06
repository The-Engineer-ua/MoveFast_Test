package com.glushkov.movefast

import android.app.Application
import com.glushkov.movefast.di.networkModule
import com.glushkov.movefast.di.repositoryModule
import com.glushkov.movefast.di.storageModule
import com.glushkov.movefast.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        //DI init. Inline cause nothing more here expected.
        startKoin {
            androidContext(this@BaseApplication)
            modules(listOf(
                networkModule,
                repositoryModule,
                viewModule,
                storageModule
            ))
        }
    }
}