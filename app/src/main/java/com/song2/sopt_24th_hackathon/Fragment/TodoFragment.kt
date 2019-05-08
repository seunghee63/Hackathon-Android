package com.song2.sopt_24th_hackathon.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.song2.sopt_24th_hackathon.Activity.DetailedTodoActivity
import com.song2.sopt_24th_hackathon.Adapter.TodoOverviewRecyclerViewAdapter
import com.song2.sopt_24th_hackathon.Data.TodoData
import com.song2.sopt_24th_hackathon.NetworkService.ApiClient
import com.song2.sopt_24th_hackathon.NetworkService.Get.GetTodoData
import com.song2.sopt_24th_hackathon.NetworkService.Get.GetTodoListResponse
import com.song2.sopt_24th_hackathon.NetworkService.NetworkService

import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.fragment_todo.*
import kotlinx.android.synthetic.main.fragment_todo.view.*
import org.jetbrains.anko.support.v4.startActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class TodoFragment : Fragment() {

    lateinit var todoOverviewRecyclerViewAdapter: TodoOverviewRecyclerViewAdapter
    lateinit var networkService : NetworkService
    var toDoDataList = ArrayList<GetTodoData>()
    var toDoData = ArrayList<TodoData>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                   savedInstanceState: Bundle?): View? {

        val v = inflater.inflate(R.layout.fragment_todo, container, false)
        // Inflate the layout for this fragment

        getTodoList(v)


        v.fab_todo.setOnClickListener {
            startActivity<DetailedTodoActivity>()
        }

        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

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
                                if(toDoDataList[i].title != null)
                                 toDoData.add(TodoData("2019/05/06", toDoDataList[i].title, toDoDataList[i].reward!!))
                            }
                            todoOverviewRecyclerViewAdapter = TodoOverviewRecyclerViewAdapter(context!!, toDoData)

                            v.rv_todo_overview.adapter = todoOverviewRecyclerViewAdapter
                            v.rv_todo_overview.layoutManager = GridLayoutManager(context!!, 2)
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
