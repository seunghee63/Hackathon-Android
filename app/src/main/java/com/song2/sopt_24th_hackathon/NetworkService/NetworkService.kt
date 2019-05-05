package com.song2.sopt_24th_hackathon.NetworkService

import com.song2.sopt_24th_hackathon.NetworkService.Get.GetTodoListResponse
import retrofit2.http.GET

interface NetworkService {

    ////////////////////* GET *///////////////////////////

    @GET("/toDo")
    fun getTodo(
    ): retrofit2.Call<GetTodoListResponse>
}