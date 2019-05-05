package com.song2.sopt_24th_hackathon.Adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.song2.sopt_24th_hackathon.R

class WantViewHolder(itemView : View?) : RecyclerView.ViewHolder(itemView!!) {

    var wantName : TextView = itemView!!.findViewById(R.id.item_want_name_tv)
    var wantBtn : Button = itemView!!.findViewById(R.id.item_want_btn)
}