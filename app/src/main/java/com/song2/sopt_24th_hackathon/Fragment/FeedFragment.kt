package com.song2.sopt_24th_hackathon.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.song2.sopt_24th_hackathon.R
import kotlinx.android.synthetic.main.fragment_feed.view.*

class FeedFragment : Fragment() {

    val habitFragment = HabitFragment()
    val photoFragment = PhotoFragment()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_feed, container, false)

        addFragment(habitFragment)


        view.rl_feed_fragment_photo_diary.setOnClickListener {
            replaceFragment(photoFragment,0)
        }

        view.rl_feed_fragment_feed.setOnClickListener {
            replaceFragment(habitFragment,1)
        }

        return view
    }

    fun replaceFragment(fragment: Fragment, checkFlag : Int) {
        val fm = childFragmentManager
        val transaction = fm.beginTransaction()

        if(checkFlag == 0){
            val photoFragment = PhotoFragment()

            transaction.replace(R.id.ll_content_layout, photoFragment)
            transaction.commit()
        }
        else{
            val habitFragment = HabitFragment()

            transaction.replace(R.id.ll_content_layout, habitFragment)
            transaction.commit()
        }


    }

    fun addFragment(fragment : Fragment){
        val fm = childFragmentManager
        val transaction = fm.beginTransaction()

        transaction.add(R.id.ll_content_layout, fragment)
        transaction.commit()
    }

}
