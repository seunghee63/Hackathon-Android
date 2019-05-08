package com.song2.sopt_24th_hackathon.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.song2.sopt_24th_hackathon.Data.DateListData
import com.song2.sopt_24th_hackathon.Data.HabitListData
import com.song2.sopt_24th_hackathon.R

class PhotoRecyclerViewAdapter(val ctx : Context, val dataList : ArrayList<DateListData>) : RecyclerView.Adapter<PhotoRecyclerViewAdapter.Holder>(){

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int) :Holder{
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_photo,viewGroup,false)
        return Holder(view)
    }

    override fun getItemCount():Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.date.text = dataList[position].date
        for (i in 0.. dataList[position].img_url.size-1) {
            if(i == 0){
                Glide.with(ctx)
                    .load(dataList[position].img_url[i])
                    .into(holder.photo_cnt0)
            }else if(i == 1){
                Glide.with(ctx)
                    .load(dataList[position].img_url[i])
                    .into(holder.photo_cnt1)
            }else if(i == 2){
                Glide.with(ctx)
                    .load(dataList[position].img_url[i])
                    .into(holder.photo_cnt2)
            }else if(i == 3){
                Glide.with(ctx)
                    .load(dataList[position].img_url[i])
                    .into(holder.photo_cnt3)
            }
        }

    }


    inner class Holder(itemView : View) :RecyclerView.ViewHolder(itemView){
        var date = itemView.findViewById(R.id.tv_rv_item_date) as TextView

        var photo_cnt0 = itemView.findViewById(R.id.iv_rv_photo_cnt0) as ImageView
        var photo_cnt1 = itemView.findViewById(R.id.iv_rv_photo_cnt1) as ImageView
        var photo_cnt2 = itemView.findViewById(R.id.iv_rv_photo_cnt2) as ImageView
        var photo_cnt3 = itemView.findViewById(R.id.iv_rv_photo_cnt3) as ImageView

    }
}