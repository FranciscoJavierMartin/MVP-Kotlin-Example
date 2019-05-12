package com.example.mvpkotlin.ui.post

import android.support.annotation.StringRes
import com.example.mvpkotlin.base.BaseView
import com.example.mvpkotlin.model.Post

interface PostView : BaseView{

    fun updatePosts(posts: List<Post>)

    fun showError(error: String)

    fun showError(@StringRes errorResId: Int){
        this.showError(getContext().getString(errorResId))
    }

    fun showLoading()

    fun hideLoading()
}