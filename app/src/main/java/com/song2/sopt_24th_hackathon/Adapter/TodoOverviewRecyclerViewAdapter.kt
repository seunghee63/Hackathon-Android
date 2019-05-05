package com.song2.sopt_24th_hackathon.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bumptech.glide.Glide
import com.song2.sopt_24th_hackathon.Data.TodoOverviewData
import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.rv_item_todo_overview.view.*
import org.w3c.dom.Text

class TodoOverviewRecyclerViewAdapter(val ctx: Context, val dataList: ArrayList<TodoOverviewData>): RecyclerView.Adapter<TodoOverviewRecyclerViewAdapter.Holder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_todo_overview, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.date.text = dataList[position].date
        holder.mission.text = dataList[position].mission
        holder.podo_num.text = dataList[position].podo_num
    }


    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var date = itemView.findViewById(R.id.txt_rv_item_todo_overview_date) as TextView
        var mission = itemView.findViewById(R.id.txt_rv_item_todo_overview_mission) as TextView
        var podo_num = itemView.findViewById(R.id.txt_rv_item_todo_overview_podo_num) as TextView
    }
}
