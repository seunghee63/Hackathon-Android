package com.song2.sopt_24th_hackathon.NetworkService

import com.song2.sopt_24th_hackathon.NetworkService.Get.GetTodoListResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkService {

    ////////////////////* GET *///////////////////////////

    @GET("/toDo")
    fun getTodo(
    ): Call<GetTodoListResponse>
}