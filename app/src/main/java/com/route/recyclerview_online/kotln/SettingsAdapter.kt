package com.route.recyclerview_online.kotln

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.route.recyclerview_online.R
import java.util.*

class SettingsAdapter(var items: ArrayList<SettingsItem>): RecyclerView.Adapter<SettingsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      val view : View = LayoutInflater.from(parent.context).
      inflate(R.layout.item_settings, parent, false)
       return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items.get(position)
        holder.title.text = item.title
        holder.subTitle.text = item.subtitle
        holder.settingsIcon.setImageResource(item.imageId)
        holder.settingsIcon.setOnClickListener{view->
            ///todo: write your logic
           onIconClick?.onItemClick(item, position)

        }
        holder.settingsIcon.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
             /// todo: write your logic here
            }
        })
    }
    var onIconClick: OnItemClickListener? = null

    interface OnItemClickListener{
        fun onItemClick(item: SettingsItem, position: Int)
    }
    override fun getItemCount(): Int {
       return items.size
    }
    class ViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView){
        val settingsIcon: ImageView = itemView.findViewById(R.id.item_settings_icon)
        val title: TextView= itemView.findViewById(R.id.item_settings_title)
        val subTitle: TextView = itemView.findViewById(R.id.item_settings_subtitle)
    }
}