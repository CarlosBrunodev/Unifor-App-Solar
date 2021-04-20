package com.example.sistemasolarapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sistemasolarapp.R
import com.example.sistemasolarapp.adapter.OnSolarItemListener
import com.example.sistemasolarapp.adapter.SolarAdapter
import com.example.sistemasolarapp.util.SolarRepository

class MainActivity : AppCompatActivity() , OnSolarItemListener {

    private lateinit var mList: RecyclerView
    private  val solarps = SolarRepository.getAll()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val solarps = SolarRepository.getAll()

        val llm = LinearLayoutManager(this)
        val solarAdapter = SolarAdapter(solarps)
        solarAdapter.setOnSolarItemListener(this)

        mList = findViewById(R.id.main_recyclerview_list)

        mList.apply{
            adapter = solarAdapter
            layoutManager = llm
            hasFixedSize()
        }

        /*
        mList.adapter = myadapter
        mList.layoutManager = llm
        mList.hasFixedSize()
         */
    }

    override fun onClick(view: View, position: Int) {

        val it = Intent(this, DetailActivity::class.java)
        it.putExtra("position", position)
        startActivity(it)

     //   Toast.makeText(
       //         view.context,
         //       " $position , ${solarps[position].name} ",
           //     Toast.LENGTH_LONG).show()
    }
}