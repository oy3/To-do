package com.example.task

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.task.data.Task

class TaskAdapter(var tasks: List<Task>?) : RecyclerView.Adapter<TaskAdapter.ViewHolder>() {

//     val tasks : ArrayList<String> = ArrayList()


    fun initTaskAdapter(tasks: List<Task>) {
        this.tasks = tasks
        notifyDataSetChanged()
//        tasks.add(tasks)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_selection_view_holder, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tasks!!.size
    }

    override fun onBindViewHolder(holder: TaskAdapter.ViewHolder, position: Int) {
        holder.listPosition.text = (position + 1).toString()
        holder.listTitle.text = tasks!!.get(position).title
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val listPosition = itemView.findViewById(R.id.itemNumber) as TextView
        val listTitle = itemView.findViewById(R.id.itemString) as TextView
    }


}
