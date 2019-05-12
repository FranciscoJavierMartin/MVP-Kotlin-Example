package com.example.mvpkotlin.utils

import android.databinding.BindingAdapter
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.RecyclerView
import com.example.mvpkotlin.ui.post.PostAdapter

//@file:Suppress("unused")

@BindingAdapter("adapter")
fun setAdapter(view: RecyclerView, adapter: PostAdapter){
    view.adapter = adapter
}

@BindingAdapter("layoutManager")
fun setLayoutManager(view: RecyclerView, layoutManager: RecyclerView.LayoutManager){
    view.layoutManager = layoutManager
}

@BindingAdapter("dividerItemDecoration")
fun setDividerItemDecoration(view: RecyclerView, dividerItemDecoration: DividerItemDecoration){
    view.addItemDecoration(dividerItemDecoration)
}