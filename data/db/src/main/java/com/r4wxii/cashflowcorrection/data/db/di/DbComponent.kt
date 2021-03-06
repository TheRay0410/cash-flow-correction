package com.r4wxii.cashflowcorrection.data.db.di

import android.content.Context
import com.r4wxii.cashflowcorrection.data.db.AccountDatabase
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        DbModule::class
    ]
)
interface DbComponent {
    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context
        ): DbComponent
    }

    fun accountDataBase(): AccountDatabase
}