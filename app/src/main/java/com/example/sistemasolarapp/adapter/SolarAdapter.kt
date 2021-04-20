package com.example.sistemasolarapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sistemasolarapp.R
import com.example.sistemasolarapp.model.Solar


class SolarAdapter(private val solarps:List<Solar>):
    RecyclerView.Adapter<SolarAdapter.SolarViewHolder>(){

    private var listener: OnSolarItemListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SolarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.solar_item,parent,false)
        return SolarViewHolder(view,listener)
    }

    override fun getItemCount(): Int {
        return solarps.size
    }

    override fun onBindViewHolder(holder: SolarViewHolder, position: Int) {
        holder.iName.text = solarps[position].name
      //  holder.iDescricao.text = solarps[position].descricao
    }

    fun setOnSolarItemListener(listener: OnSolarItemListener){
        this.listener = listener
    }
    class SolarViewHolder(view: View, listener: OnSolarItemListener?):RecyclerView.ViewHolder(view){

        val iName:TextView = view.findViewById(R.id.solar_item_textview_name)
        val iDescricao:TextView = view.findViewById(R.id.solar_item_textview_descricao)

        init {
            view.setOnClickListener{
                listener?.onClick(it,adapterPosition)

            }
        }

    }

}