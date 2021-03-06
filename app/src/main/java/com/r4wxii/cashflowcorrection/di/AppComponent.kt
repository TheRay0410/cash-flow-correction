package com.r4wxii.cashflowcorrection.di

import android.app.Application
import com.r4wxii.cashflowcorrection.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, ActivityModule::class, DbComponentModule::class, RepositoryComponentModule::class, UseCaseComponentModule::class])
interface AppComponent : AndroidInjector<MainApplication> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): AppComponent
    }

    override fun inject(app: MainApplication)
}