package com.song2.sopt_24th_hackathon.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.song2.sopt_24th_hackathon.R

class FeedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_feed, container, false)
        //addFragment()
        return view
    }

/*    fun addFragment(fragment : Fragment){
        val fm = childFragmentManager
        val transaction = fm.beginTransaction()

        *//*val myIntroFragment = MypageIntroFragment()
        val bundle = Bundle()
        bundle.putString("name", name)
        bundle.putString("job", job)
        bundle.putString("company", company)
        bundle.putString("image", image)
        bundle.putString("field", field)
        bundle.putInt("userID", userID)
        bundle.putInt("my_or_other_flag", my_or_other_flag)
        Log.v("asdf", "보내는필드 = " + field)
        bundle.putString("status", status)
        bundle.putInt("coworkingEnabled", coworkingEnabled)
        myIntroFragment.setArguments(bundle)*//*

        transaction.add(R.id.ll_content_layout, myIntroFragment)
        transaction.commit()
    }*/

}
