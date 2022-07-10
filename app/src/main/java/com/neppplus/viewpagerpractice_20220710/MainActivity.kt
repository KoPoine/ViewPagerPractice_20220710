package com.neppplus.viewpagerpractice_20220710

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.neppplus.viewpagerpractice_20220710.adapters.MainViewPagerAdapter
import com.neppplus.viewpagerpractice_20220710.fragments.NameFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPagerAdapter = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mPagerAdapter

        mainTabLayout.setupWithViewPager(mainViewPager)
    }
}