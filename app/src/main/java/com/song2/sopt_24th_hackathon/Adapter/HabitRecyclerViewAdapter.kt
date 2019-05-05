package com.song2.sopt_24th_hackathon.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.song2.sopt_24th_hackathon.Data.HabitListData
import com.song2.sopt_24th_hackathon.R

class HabitRecyclerViewAdapter(val ctx : Context, val dataList : ArrayList<HabitListData>) : RecyclerView.Adapter<HabitRecyclerViewAdapter.Holder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) :Holder{
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_habit,viewGroup,false)
        return Holder(view)
    }

    override fun getItemCount():Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.habit.text = dataList[position].habit

        if (dataList[position].podo_cnt == 1)
        {

        }

    }

    inner class Holder(itemView : View) :RecyclerView.ViewHolder(itemView){
        var habit = itemView.findViewById(R.id.tv_rv_item_habit) as TextView

        var podo_cnt0 = itemView.findViewById(R.id.iv_rv_podo_cnt_0) as ImageView
        var podo_cnt1 = itemView.findViewById(R.id.iv_rv_podo_cnt_1) as ImageView
        var podo_cnt2 = itemView.findViewById(R.id.iv_rv_podo_cnt_2) as ImageView
        var podo_cnt3 = itemView.findViewById(R.id.iv_rv_podo_cnt_3) as ImageView
        var podo_cnt4 = itemView.findViewById(R.id.iv_rv_podo_cnt_4) as ImageView
        var podo_cnt5 = itemView.findViewById(R.id.iv_rv_podo_cnt_5) as ImageView
        var podo_cnt6 = itemView.findViewById(R.id.iv_rv_podo_cnt_6) as ImageView

    }
}