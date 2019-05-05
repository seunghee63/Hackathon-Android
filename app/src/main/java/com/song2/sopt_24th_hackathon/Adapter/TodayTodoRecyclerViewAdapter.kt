package com.song2.sopt_24th_hackathon.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.song2.sopt_24th_hackathon.Data.TodayTodoListData
import com.song2.sopt_24th_hackathon.R

class TodayTodoRecyclerViewAdapter(val ctx : Context, val dataList :ArrayList<TodayTodoListData>): RecyclerView.Adapter<TodayTodoRecyclerViewAdapter.Holder>(){


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) :Holder{
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_today_todo,viewGroup,false)
        return Holder(view)
    }

    override fun getItemCount():Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        var pos_cnt = position+1
        holder.mission.text = pos_cnt.toString()+". " + dataList[position].mission
        holder.podo_num.text = "상품: "+dataList[position].podo_num.toString() +"포도"

    }


    inner class Holder(itemView : View) :RecyclerView.ViewHolder(itemView){
        var mission = itemView.findViewById(R.id.tv_rv_item_mission) as TextView
        var podo_num = itemView.findViewById(R.id.rv_tv_item_podo_cnt) as TextView
    }
}