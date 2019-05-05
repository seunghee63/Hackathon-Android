package com.song2.sopt_24th_hackathon.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.song2.sopt_24th_hackathon.Adapter.TodayTodoRecyclerViewAdapter
import com.song2.sopt_24th_hackathon.Data.TodayTodoListData

import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    lateinit var todayTodoRecyclerViewAdapter : TodayTodoRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var dataList : ArrayList<TodayTodoListData> = ArrayList()
        dataList.add(TodayTodoListData("일기 쓰기", 3,false))
        dataList.add(TodayTodoListData("영어단어 5개 외우기", 3,false))

        todayTodoRecyclerViewAdapter = TodayTodoRecyclerViewAdapter(context!!,dataList)
        rv_today_todo_list.adapter = todayTodoRecyclerViewAdapter
        rv_today_todo_list.layoutManager = LinearLayoutManager(context!!)
    }


}
