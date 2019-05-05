package com.song2.sopt_24th_hackathon.Fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.song2.sopt_24th_hackathon.Activity.MarketActivity
import com.song2.sopt_24th_hackathon.Adapter.WantAdapter
import com.song2.sopt_24th_hackathon.Data.WantData
import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.fragment_my_page.view.*


class MyPageFragment : Fragment() {

    lateinit var wantDataItem: ArrayList<WantData>
    lateinit var WantAdapter : WantAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val v = inflater.inflate(R.layout.fragment_my_page, container, false)
        // Inflate the layout for this fragment

        getWantData(v)

        v.mypage_podomarket_tv.setOnClickListener{
            var intent = Intent(activity, MarketActivity::class.java)
            startActivity(intent)
        }

        return v
    }

    private fun getWantData(v : View) {
        wantDataItem = ArrayList()
        wantDataItem.add(WantData("제민이 맛있는거 사주기"))
        wantDataItem.add(WantData("제민이 음료 사주기"))
        wantDataItem.add(WantData("제민이 피자 사주기"))
        wantDataItem.add(WantData("제민이 치킨 사주기"))
        wantDataItem.add(WantData("제민이 라면 사주기"))
        wantDataItem.add(WantData("제민이 커피 사주기"))
        wantDataItem.add(WantData("제민이 술 사주기"))
        wantDataItem.add(WantData("제민이 맥주 사주기"))
        WantAdapter = WantAdapter(wantDataItem)

        v.mypage_want_recyclerview.layoutManager = LinearLayoutManager(v.context)
        v.mypage_want_recyclerview.adapter = WantAdapter
        //v.mypage_want_recyclerview.setNestedScrollingEnabled(false)

    }
}