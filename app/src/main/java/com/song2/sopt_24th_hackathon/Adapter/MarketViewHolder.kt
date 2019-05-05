package com.song2.sopt_24th_hackathon.Adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.song2.sopt_24th_hackathon.R

class MarketViewHolder(itemView : View?) : RecyclerView.ViewHolder(itemView!!) {

    var marketName : TextView = itemView!!.findViewById(R.id.item_market_name)
    var marketPodoTv : TextView = itemView!!.findViewById(R.id.item_market_podo_tv)
    var marketBtn : Button = itemView!!.findViewById(R.id.item_market_btn)
}