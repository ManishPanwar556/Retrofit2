package com.manish.retrofit2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layoutgit.view.*

class Recycleradapter(val list: List<User>) : RecyclerView.Adapter<Recycleradapter.viewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        viewholder(LayoutInflater.from(parent.context).inflate(R.layout.layoutgit, parent, false))


    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val list=list[position]
        holder.bind(list)
    }


    inner class viewholder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun bind(user: User)= with(itemView){
            tv.text=user.login
            Picasso.get().load(user.avatar_url).into(image)
        }
    }

}