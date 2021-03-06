package com.song2.sopt_24th_hackathon.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.song2.sopt_24th_hackathon.Adapter.HabitRecyclerViewAdapter
import com.song2.sopt_24th_hackathon.Adapter.TodayTodoRecyclerViewAdapter
import com.song2.sopt_24th_hackathon.Adapter.TodoOverviewRecyclerViewAdapter
import com.song2.sopt_24th_hackathon.Data.HabitListData
import com.song2.sopt_24th_hackathon.Data.TodayTodoListData
import com.song2.sopt_24th_hackathon.NetworkService.Get.GetTodoData
import com.song2.sopt_24th_hackathon.NetworkService.NetworkService

import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    lateinit var todayTodoRecyclerViewAdapter : TodayTodoRecyclerViewAdapter
    lateinit var habitRecyclerViewAdapter: HabitRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var dataList : ArrayList<TodayTodoListData> = ArrayList()
        dataList.add(TodayTodoListData("일기 쓰기", 3,false))
        dataList.add(TodayTodoListData("영어단어 5개 외우기", 3,false))
        dataList.add(TodayTodoListData("구몬 3장 풀기", 3,false))
        dataList.add(TodayTodoListData("컴퓨터 1시간 하기", 3,false))
        dataList.add(TodayTodoListData("10시 전에 자기", 3,false))
        dataList.add(TodayTodoListData("양치 하루 세번하기", 3,false))
        dataList.add(TodayTodoListData("자기 전에 씻기", 3,false))
        dataList.add(TodayTodoListData("설거지하기", 3,false))

        todayTodoRecyclerViewAdapter = TodayTodoRecyclerViewAdapter(context!!,dataList)
        rv_today_todo_list.adapter = todayTodoRecyclerViewAdapter
        rv_today_todo_list.layoutManager = LinearLayoutManager(context!!)

        var dataList0 : ArrayList<HabitListData> = ArrayList()
        dataList0.add(HabitListData("김치 먹기", 3))
        dataList0.add(HabitListData("아침 인사하기", 3))
        dataList0.add(HabitListData("일기 쓰기", 3))
        dataList0.add(HabitListData("편식 안하기", 3))
        dataList0.add(HabitListData("화내지 않기", 3))

        habitRecyclerViewAdapter = HabitRecyclerViewAdapter(context!!,dataList0)
        rv_habit_list.adapter = habitRecyclerViewAdapter
        rv_habit_list.layoutManager = LinearLayoutManager(context!!, LinearLayout.HORIZONTAL,false)
    }
}
