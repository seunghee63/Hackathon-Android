package com.song2.sopt_24th_hackathon.Activity

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.song2.sopt_24th_hackathon.Adapter.MarketAdapter
import com.song2.sopt_24th_hackathon.Data.MarketData
import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.activity_market.*

class MarketActivity : AppCompatActivity()  {

    lateinit var marketAdapter : MarketAdapter
    lateinit var marketDataList : ArrayList<MarketData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_market)
        getMarketData();
    }

    private fun getMarketData() {
        marketDataList = ArrayList()
        marketDataList.add(MarketData("제민이 짜장면 이용권",200))
        marketDataList.add(MarketData("제민이 치킨 무한 이용권",100))
        marketDataList.add(MarketData("제민이 용돈 주기 이용권",300))
        marketDataList.add(MarketData("제민이 맘대로 이용권",500))
        marketDataList.add(MarketData("제민이 꽝 이용권",400))
        marketAdapter = MarketAdapter(marketDataList, this)

        market_content_recyclerview.layoutManager = LinearLayoutManager(applicationContext)
        market_content_recyclerview.adapter = marketAdapter

    }


}
