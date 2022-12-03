package com.tw.ideafoundation.ui.projectUI

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.text.HtmlCompat
import androidx.recyclerview.widget.RecyclerView
import com.tw.ideafoundation.R
import com.tw.ideafoundation.data.UserProjectsItem


class AdapterProject : RecyclerView.Adapter<AdapterProject.ViewHolder>() {
    var list: MutableList<UserProjectsItem> = ArrayList()

    fun setData(projectList: List<UserProjectsItem>) {
        this.list = projectList as MutableList<UserProjectsItem>
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_project, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.txt_title.text = "Title:- " + list[position].title

        if (list[position].projectCost.isNotEmpty()) {
            holder.txt_project_cost.text = "Project Cost:- " + list[position].projectCost
        } else {
            holder.txt_project_cost.visibility = View.GONE
        }

        holder.txt_project_cost.text = "Project Cost:- " + list[position].projectCost

        if (list[position].status.isNotEmpty()) {
            holder.txt_status.text = "Status:- " + list[position].status
        } else {
            holder.txt_status.visibility = View.GONE
        }

        if (list[position].description.isNotEmpty()) {
            holder.txt_description.text = "Description" + list.get(position).description
        } else {
            holder.txt_description.visibility = View.GONE
        }

        if (list[position].description.isNotEmpty()) {
            val spanned =
                HtmlCompat.fromHtml(
                    list.get(position).description,
                    HtmlCompat.FROM_HTML_MODE_COMPACT
                )
            holder.txt_description.text = "Description" + spanned
        } else {
            holder.txt_description.visibility = View.GONE
        }


    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(viewItem: View) : RecyclerView.ViewHolder(viewItem) {
        var txt_title: TextView
        var txt_project_cost: TextView
        var txt_status: TextView
        var txt_description: TextView

        init {
            txt_title = itemView.findViewById(R.id.txtTitle)
            txt_project_cost = itemView.findViewById(R.id.txt_project_cost)
            txt_status = itemView.findViewById(R.id.txt_status)
            txt_description = itemView.findViewById(R.id.txt_description)
        }

    }
}