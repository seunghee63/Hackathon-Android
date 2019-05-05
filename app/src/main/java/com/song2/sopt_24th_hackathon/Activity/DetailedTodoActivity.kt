package com.song2.sopt_24th_hackathon.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.activity_detailed_todo.*
import org.jetbrains.anko.startActivity

class DetailedTodoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_todo)

        btn_detailed_todo_submit.setOnClickListener {
            finish()
        }
    }



}
