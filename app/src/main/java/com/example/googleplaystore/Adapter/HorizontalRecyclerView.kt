package com.example.w7_recyclerview.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplaystore.R
import com.example.googleplaystore.Apps

class HorizontalRecyclerView(private  var appList: ArrayList<Apps>) :RecyclerView.Adapter<HorizontalRecyclerView.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return appList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = appList[position]
        holder.imageApp.setImageResource(currentItem.titleImage)
        holder.nameApp.text = currentItem.appName
        holder.starApp.text = currentItem.star
    }

    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val imageApp : ImageView = itemView.findViewById(R.id.app_icon)
        val nameApp: TextView = itemView.findViewById(R.id.app_name)
        val starApp: TextView = itemView.findViewById(R.id.app_star)
    }

}