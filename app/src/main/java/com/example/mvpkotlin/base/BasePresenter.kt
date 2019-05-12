package com.example.mvpkotlin.base

import com.example.mvpkotlin.injection.component.PresenterInjector
import com.example.mvpkotlin.injection.module.ContextModule
import com.example.mvpkotlin.injection.module.NetworkModule
import com.example.mvpkotlin.ui.post.PostPresenter

abstract class BasePresenter <out V: BaseView>(protected val view: V){

    private val injector: PresenterInjector = DaggerPresenterInjector
        .builder()
        .baseView(view)
        .contextModule(ContextModule)
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    open fun onViewCreated(){}

    open fun onViewDestroyed(){}

    private fun inject(){
        when(this){
            is PostPresenter -> injector.inject(this)
        }
    }
}