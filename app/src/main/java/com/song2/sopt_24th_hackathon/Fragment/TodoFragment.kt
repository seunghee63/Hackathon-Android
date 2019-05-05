package com.song2.sopt_24th_hackathon.Fragment


import android.net.NetworkInfo
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.song2.sopt_24th_hackathon.Activity.DetailedTodoActivity
import com.song2.sopt_24th_hackathon.Adapter.TodoOverviewRecyclerViewAdapter
import com.song2.sopt_24th_hackathon.Data.TodoOverviewData

import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.fragment_todo.*
import kotlinx.android.synthetic.main.rv_item_todo_overview.*
import org.jetbrains.anko.support.v4.startActivity


class TodoFragment : Fragment() {

    lateinit var todoOverviewRecyclerViewAdapter: TodoOverviewRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_todo, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var dataList: ArrayList<TodoOverviewData> = ArrayList()
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))
        dataList.add(TodoOverviewData(
            "2019/05/05","받아쓰기 공부", "2포도알"))


        todoOverviewRecyclerViewAdapter = TodoOverviewRecyclerViewAdapter(context!!, dataList)
        rv_todo_overview.adapter = todoOverviewRecyclerViewAdapter
        rv_todo_overview.layoutManager = GridLayoutManager(context!!, 2)


        fab_todo.setOnClickListener {
            startActivity<DetailedTodoActivity>()
        }

    }


}
