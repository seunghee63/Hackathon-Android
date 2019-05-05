package com.song2.sopt_24th_hackathon.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.song2.sopt_24th_hackathon.Data.WantData
import com.song2.sopt_24th_hackathon.R

class WantAdapter (private var myWantData : ArrayList<WantData>) : RecyclerView.Adapter<WantViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WantViewHolder {
        val mainView : View = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_want, parent, false)
        return WantViewHolder(mainView)
    }

    override fun getItemCount(): Int = myWantData.size

    //데이터클래스와 뷰홀더를 이어준다.
    override fun onBindViewHolder(holder: WantViewHolder, position: Int) {
        holder.wantName.text = myWantData[position].name
        holder.wantBtn.text = "수락하기"
    }
}