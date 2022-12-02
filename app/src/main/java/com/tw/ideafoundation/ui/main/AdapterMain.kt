package com.tw.ideafoundation.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tw.ideafoundation.R

class AdapterMain : RecyclerView.Adapter<AdapterMain.ViewHolder>() {

    fun setData(list: List<String>) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txv_title.text = "Hello There"
    }

    override fun getItemCount(): Int {
        return 5
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var txv_price: TextView
        var txv_title: TextView

        init {
            txv_price = view.findViewById(R.id.txv_price)
            txv_title = view.findViewById(R.id.txv_title)
        }

    }
}