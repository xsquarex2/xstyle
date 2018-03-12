package com.xsquare.xstyle

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.xsquare.xstyle.adapter.ItemClickListener
import com.xsquare.xstyle.adapter.MainAdapter
import com.xsquare.xstyle.ui.SelectorActivity
import com.xsquare.xstyle.ui.ShapeActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var adapter:MainAdapter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MainAdapter()
        recyclerView.adapter = adapter
        adapter!!.setOnclickListener(object: ItemClickListener {
            override fun onItemClick(position: Int) {
                when(position){
                    0 ->{
                        startActivity(Intent(this@MainActivity,ShapeActivity::class.java))
                    }
                    1 ->{
                       startActivity(Intent(this@MainActivity,SelectorActivity::class.java))
                    }
                }
            }
        })
    }
}
