package com.example.lab3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GoalAdapter(private val dataSet: Array<Goal>) : RecyclerView.Adapter<GoalAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val day: TextView = view.findViewById(R.id.day)
        val goalTitle: TextView = view.findViewById(R.id.goal_title)
        val image: ImageView = view.findViewById(R.id.image)
        val description: TextView = view.findViewById(R.id.description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.goal, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.day.text = String.format(dataSet[position].day.toString())
        holder.goalTitle.text = dataSet[position].title
        holder.image.setImageResource(dataSet[position].image)
        holder.description.text = dataSet[position].description
    }

    override fun getItemCount(): Int = dataSet.size
}