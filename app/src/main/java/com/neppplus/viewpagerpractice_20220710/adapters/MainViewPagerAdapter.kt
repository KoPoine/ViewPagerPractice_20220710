package com.neppplus.viewpagerpractice_20220710.adapters

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpagerpractice_20220710.fragments.BirthFragment
import com.neppplus.viewpagerpractice_20220710.fragments.HelloFragment
import com.neppplus.viewpagerpractice_20220710.fragments.NameFragment

class MainViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {
//    총 몇 페이지의 뷰페이저인지 숫자를 알려달라
    override fun getCount(): Int {
        return 3
    }

//    각각의 position에 어떤 프래그먼트 객체가 결과로 return될건지 알려달라.
    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return NameFragment()
            }
            1 -> {
                return BirthFragment()
            }
            else -> {
                return HelloFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "이름"
            }
            1 -> {
                return "생년"
            }
            else -> {
                return "인사말"
            }
        }
    }
}