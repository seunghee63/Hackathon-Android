package com.song2.sopt_24th_hackathon.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
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
import com.song2.sopt_24th_hackathon.Data.TodoData
import com.song2.sopt_24th_hackathon.NetworkService.ApiClient
import com.song2.sopt_24th_hackathon.NetworkService.Get.GetTodoData
import com.song2.sopt_24th_hackathon.NetworkService.Get.GetTodoListResponse
import com.song2.sopt_24th_hackathon.NetworkService.NetworkService

import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment : Fragment() {
    lateinit var todayTodoRecyclerViewAdapter : TodayTodoRecyclerViewAdapter
    lateinit var habitRecyclerViewAdapter: HabitRecyclerViewAdapter

    lateinit var todoOverviewRecyclerViewAdapter: TodoOverviewRecyclerViewAdapter
    lateinit var networkService : NetworkService
    var toDoDataList = ArrayList<GetTodoData>()
    var toDoData = ArrayList<TodoData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

       /* var dataList : ArrayList<TodayTodoListData> = ArrayList()
        dataList.add(TodayTodoListData("일기 쓰기", 3,false))
        dataList.add(TodayTodoListData("영어단어 5개 외우기", 3,false))
        dataList.add(TodayTodoListData("일기 쓰기", 3,false))
        dataList.add(TodayTodoListData("영어단어 5개 외우기", 3,false))
        dataList.add(TodayTodoListData("일기 쓰기", 3,false))
        dataList.add(TodayTodoListData("영어단어 5개 외우기", 3,false))
        dataList.add(TodayTodoListData("일기 쓰기", 3,false))
        dataList.add(TodayTodoListData("영어단어 5개 외우기", 3,false))

        todayTodoRecyclerViewAdapter = TodayTodoRecyclerViewAdapter(context!!,dataList)
        rv_today_todo_list.adapter = todayTodoRecyclerViewAdapter
        rv_today_todo_list.layoutManager = LinearLayoutManager(context!!)
*/

        var dataList0 : ArrayList<HabitListData> = ArrayList()
        dataList0.add(HabitListData("김치 먹기", 3))
        dataList0.add(HabitListData("영어단어 5개 외우기", 3))
        dataList0.add(HabitListData("일기 쓰기", 3))
        dataList0.add(HabitListData("영어단어 5개 외우기", 3))
        dataList0.add(HabitListData("일기 쓰기", 3))
        dataList0.add(HabitListData("영어단어 5개 외우기", 3))
        dataList0.add(HabitListData("일기 쓰기", 3))

        habitRecyclerViewAdapter = HabitRecyclerViewAdapter(context!!,dataList0)
        rv_habit_list.adapter = habitRecyclerViewAdapter
        rv_habit_list.layoutManager = LinearLayoutManager(context!!, LinearLayout.HORIZONTAL,false)
    }

    // toDo 리스트 가져오기
    private fun getTodoList(v : View) {
        try {
            networkService = ApiClient.getRetrofit().create(NetworkService::class.java)
            var getToDoResponse = networkService.getTodo() // 네트워크 서비스의 getContent 함수를 받아옴
            getToDoResponse.enqueue(object : Callback<GetTodoListResponse> {
                override fun onResponse(call: Call<GetTodoListResponse>?, response: Response<GetTodoListResponse>?) {
                    if(response!!.isSuccessful)
                    {
                        // toDo 리스트 크기 != 0
                        if(response.body()!!.data.size != 0)
                        {
                            toDoDataList = response.body()!!.data

                            for(i in 0..toDoDataList.size-1) {
                                toDoData.add(TodoData("2019-05-06", toDoDataList[i].title, toDoDataList[i].reward!!))
                            }
                            todayTodoRecyclerViewAdapter = TodayTodoRecyclerViewAdapter(context!!, toDoData)

                            v.rv_today_todo_list.adapter = todayTodoRecyclerViewAdapter
                            v.rv_today_todo_list.layoutManager = GridLayoutManager(context!!, 2)
                        }
                    }
                }
                override fun onFailure(call: Call<GetTodoListResponse>?, t: Throwable?) {
                }
            })
        } catch (e: Exception) {
        }

    }


}
