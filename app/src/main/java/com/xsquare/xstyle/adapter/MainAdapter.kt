package com.xsquare.xstyle.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.xsquare.xstyle.R
import java.util.*

/**
 *
 * Created by xsquare on 2018/3/11.
 */
class MainAdapter : RecyclerView.Adapter<MainViewHolder>(){
    private var title = arrayListOf("Shape","Selector")
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MainViewHolder =
            MainViewHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.main_adapter_item,parent,false))

    override fun onBindViewHolder(holder: MainViewHolder?, position: Int) {
        if (holder is MainViewHolder){
            val title = title[position]
            holder.tv!!.text = title
        }
    }
    override fun getItemCount(): Int = title.size
}
class MainViewHolder(private var itemView:View,var tv: TextView? = itemView.findViewById(R.id.tv)):RecyclerView.ViewHolder(itemView)

