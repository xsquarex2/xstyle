package com.xsquare.xstyle.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.xsquare.xstyle.R
/**
 *
 * Created by xsquare on 2018/3/11.
 */
class MainAdapter : RecyclerView.Adapter<MainViewHolder>(){
    private var title = arrayListOf("Shape","Selector")
    private var listener:ItemClickListener?=null
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MainViewHolder{
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.main_adapter_item,parent,false)
        return MainViewHolder(view)
    }


    override fun onBindViewHolder(holder: MainViewHolder?, position: Int) {
        if (holder is MainViewHolder){
            val title = title[position]
            holder.tv!!.text = title
        }
        holder!!.item.setOnClickListener{
            if (listener!=null){
                listener!!.onItemClick(position)
            }
        }
    }
    override fun getItemCount(): Int = title.size

    fun setOnclickListener(itemClickListener: ItemClickListener) {
        this.listener = itemClickListener
    }
}



class MainViewHolder(var item:View, var tv: TextView? = item.findViewById(R.id.tv)):RecyclerView.ViewHolder(item)
interface ItemClickListener {
    fun onItemClick(position: Int)
}
