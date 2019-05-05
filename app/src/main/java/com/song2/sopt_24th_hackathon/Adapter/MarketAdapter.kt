package com.song2.sopt_24th_hackathon.Adapter

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.RequestManager
import com.song2.sopt_24th_hackathon.Data.MarketData
import com.song2.sopt_24th_hackathon.Data.WantData
import com.song2.sopt_24th_hackathon.R
import org.jetbrains.anko.layoutInflater

class MarketAdapter (private var myMarketData : ArrayList<MarketData>, var activity : Activity) : RecyclerView.Adapter<MarketViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarketViewHolder {
        val mainView : View = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_market, parent, false)
        return MarketViewHolder(mainView)
    }

    override fun getItemCount(): Int = myMarketData.size

    //데이터클래스와 뷰홀더를 이어준다.
    override fun onBindViewHolder(holder: MarketViewHolder, position: Int) {
        holder.marketName.text = myMarketData[position].marketName
        holder.marketPodoTv.text = myMarketData[position].podo.toString() + "포도알"
        holder.marketBtn.text = "조르기"

        holder.marketBtn.setOnClickListener {
            showDialog()
        }
    }

    protected fun showDialog() {
        var customDialog = Dialog(activity)
        customDialog.setCancelable(true)
        customDialog.getWindow().setBackgroundDrawable( ColorDrawable(Color.TRANSPARENT));
        val customDialogView = activity!!.layoutInflater.inflate(R.layout.dialog_layout, null)
        customDialog.setContentView(customDialogView)

        customDialog.show()
    }
}