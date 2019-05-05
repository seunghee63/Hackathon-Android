package com.song2.sopt_24th_hackathon.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.song2.sopt_24th_hackathon.Fragment.FeedFragment
import com.song2.sopt_24th_hackathon.Fragment.HomeFragment
import com.song2.sopt_24th_hackathon.Fragment.MyPageFragment
import com.song2.sopt_24th_hackathon.Fragment.TodoFragment
import org.jetbrains.anko.support.v4._FragmentTabHost

class PodorangMainPagerAdapter(fm:FragmentManager, private val num_Fragment: Int): FragmentStatePagerAdapter(fm)
{
override fun getItem(p0: Int): Fragment? {
    return when (p0) {
        0 -> HomeFragment()
        1 -> TodoFragment()
        2 -> FeedFragment()
        3 -> MyPageFragment()
        else -> null
    }
}

    override fun getCount(): Int {
        return num_Fragment
    }
}