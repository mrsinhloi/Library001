package com.myxteam.lib001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myxteam.commons.CommonClass
import com.myxteam.utils.MyUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyUtils.print2()
        CommonClass.print1()
    }
}