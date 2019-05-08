package com.song2.sopt_24th_hackathon.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.song2.sopt_24th_hackathon.Adapter.PhotoRecyclerViewAdapter
import com.song2.sopt_24th_hackathon.Data.DateListData

import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.fragment_photo.*

class PhotoFragment : Fragment() {

    lateinit var photoRecyclerViewAdapter : PhotoRecyclerViewAdapter
    var imageUrlArray = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_photo, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var dataList : ArrayList<DateListData> = ArrayList()
        imageUrlArray.add("https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/58383648_1714122605401284_8261916106969579520_o.jpg?_nc_cat=107&_nc_ht=scontent-icn1-1.xx&oh=5685d155cc3622b1535485166619daff&oe=5D756045")
        imageUrlArray.add("https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/57336208_1714122562067955_3478487248456908800_o.jpg?_nc_cat=110&_nc_ht=scontent-icn1-1.xx&oh=37e2d4b1ab1e6797ae00db0b61ba8c1c&oe=5D2A80BE")
        imageUrlArray.add("https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/58383648_1714122605401284_8261916106969579520_o.jpg?_nc_cat=107&_nc_ht=scontent-icn1-1.xx&oh=5685d155cc3622b1535485166619daff&oe=5D756045")
        imageUrlArray.add("https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/57336208_1714122562067955_3478487248456908800_o.jpg?_nc_cat=110&_nc_ht=scontent-icn1-1.xx&oh=37e2d4b1ab1e6797ae00db0b61ba8c1c&oe=5D2A80BE")
        dataList.add(DateListData("#3월 7일", imageUrlArray))
        dataList.add(DateListData("#3월 8일", imageUrlArray))
        dataList.add(DateListData("#3월 9일", imageUrlArray))
        dataList.add(DateListData("#3월 10일", imageUrlArray))
        dataList.add(DateListData("#3월 11일", imageUrlArray))
        dataList.add(DateListData("#3월 12일", imageUrlArray))
        //dataList.add(DateListData("#3월 9일", imageUrlArray))

        photoRecyclerViewAdapter = PhotoRecyclerViewAdapter(context!!,dataList)
        rv_photo_list.adapter = photoRecyclerViewAdapter
        rv_photo_list.layoutManager = LinearLayoutManager(context!!)
    }




}
