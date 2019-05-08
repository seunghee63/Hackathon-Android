package com.song2.sopt_24th_hackathon.Activity

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.song2.sopt_24th_hackathon.NetworkService.ApiClient
import com.song2.sopt_24th_hackathon.NetworkService.NetworkService
import com.song2.sopt_24th_hackathon.NetworkService.PostResponse
import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.activity_detailed_todo.*
import okhttp3.MediaType
import okhttp3.RequestBody
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Response

class DetailedTodoActivity : AppCompatActivity() {

    lateinit var networkService : NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_todo)

        btn_detailed_todo_submit.setOnClickListener {
            finish()
        }
        btn_detailed_todo_submit.setOnClickListener {
            postPromise()
        }

    }

    // 약속 데이터 삽입
    fun postPromise() {
        networkService = ApiClient.getRetrofit().create(NetworkService::class.java)

        val postPromiseResponse = networkService.postHabbit("habit", edt_detailed_todo_mission.text.toString(), txt_detailed_todo_podo2.text.toString(),"0",edt_detailed_todo_date.text.toString())
        postPromiseResponse.enqueue(object : retrofit2.Callback<PostResponse>{

            override fun onResponse(call: Call<PostResponse>, response: Response<PostResponse>) {
                if(response.isSuccessful){
                    if(response.body()!!.data == "data added"){
                        Log.v("asdf","약속 추가")
                        Toast.makeText(applicationContext,"성공",Toast.LENGTH_LONG).show()

                        var intent = Intent(applicationContext, MainActivity::class.java)
                        startActivity(intent)
                    }
                    else{
                        Log.v("asdf","실패")
                    }
                }
                else{
                }
            }

            override fun onFailure(call: Call<PostResponse>, t: Throwable?) {
            }
        })
    }

}
