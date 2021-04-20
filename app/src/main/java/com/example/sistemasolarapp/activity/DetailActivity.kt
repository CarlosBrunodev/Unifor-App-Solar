package com.example.sistemasolarapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sistemasolarapp.R
import com.example.sistemasolarapp.util.SolarRepository
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {

    private lateinit var mName: TextView
    private lateinit var mDescricao: TextView
    private val solarps = SolarRepository.getAll()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        mName = findViewById(R.id.detail_textview_name)
        mDescricao = findViewById(R.id.detail_textview_descricao)

        val position = intent.getIntExtra("position",-1)

        mName.text = solarps[position].name
        mDescricao.text = solarps[position].descricao
    }
}