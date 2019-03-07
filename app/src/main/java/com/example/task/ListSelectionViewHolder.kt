package com.example.task

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.example.task.R


class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val listPosition = itemView.findViewById<TextView>(R.id.itemNumber) as TextView
    val listTitle = itemView.findViewById<TextView>(R.id.itemString) as TextView

}