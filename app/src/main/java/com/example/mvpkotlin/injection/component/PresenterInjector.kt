package com.example.mvpkotlin.injection.component

import com.example.mvpkotlin.base.BaseView
import com.example.mvpkotlin.injection.module.ContextModule
import com.example.mvpkotlin.injection.module.NetworkModule
import com.example.mvpkotlin.ui.post.PostPresenter
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(ContextModule::class), (NetworkModule::class)])
interface PresenterInjector {

    fun inject(postPresenter: PostPresenter)

    @Component.Builder
    interface Builder {
        fun build(): PresenterInjector
        fun networkModule(networkModule: NetworkModule): Builder
        fun contextModule(contextModule: ContextModule): Builder

        @BindsInstance
        fun baseView(baseView: BaseView): Builder
    }
}

