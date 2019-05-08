package com.song2.sopt_24th_hackathon.NetworkService

import com.song2.sopt_24th_hackathon.NetworkService.Get.GetTodoListResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface NetworkService {

    ////////////////////* GET *///////////////////////////

    @GET("/toDo")
    fun getTodo(
    ): Call<GetTodoListResponse>


    ////////////////////* POST *///////////////////////////

    // 새로운 습관 생성
    @FormUrlEncoded
    @POST("/makeToDo")
    fun postHabbit(
        @Field("type") type: String, @Field("title") title: String, @Field("reward") reward: String, @Field("count") count: String, @Field(
            "setDay"
        ) setDay: String
    ): Call<PostResponse>


}