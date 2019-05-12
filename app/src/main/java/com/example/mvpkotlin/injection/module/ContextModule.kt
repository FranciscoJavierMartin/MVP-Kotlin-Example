package com.example.mvpkotlin.injection.module

import android.app.Application
import android.content.Context
import com.example.mvpkotlin.base.BaseView
import dagger.Module
import dagger.Provides

@Module
@Suppress("unused")
object ContextModule {

    @Provides
    @JvmStatic
    internal fun provideContext(baseView: BaseView): Context = baseView.getContext()

    @Provides
    @JvmStatic
    internal fun provideApplication(context: Context): Application =
            context.applicationContext as Application
}
