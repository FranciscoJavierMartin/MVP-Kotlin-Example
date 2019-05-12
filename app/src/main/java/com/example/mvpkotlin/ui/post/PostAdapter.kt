package com.example.mvpkotlin.ui.post

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import com.example.mvpkotlin.R
import com.example.mvpkotlin.model.Post

class PostAdapter (private val context: Context): RecyclerView.Adapter<PostAdapter.PostViewHolder>(){

    private var posts: List<Post> = listOf()

    override fun onCreateViewHolder(parent: ViewParent, viewType: Int): PostAdapter.PostViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val binding: com.example.mvpkotlin.databinding.ItemPostBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_post, false)
        return PostViewHolder(binding)
    }

    override fun getItemCount(): Int  = posts.size

    override fun onBindViewHolder(holder: PostAdapter.PostViewHolder, position: Int) {
        holder?.bind(posts[position])
    }

    fun updatePosts(posts: List<Post>){
        this.posts = posts
        notifyDataSetChanged()
    }

    class PostViewHolder(private val binding: com.example.mvpkotlin.databinding.ItemPostBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(post: Post){
            binding.post = post
            binding.executePendingBindings()
        }
    }
}