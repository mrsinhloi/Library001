package com.myxteam.core

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myxteam.commons.CommonClass
import com.myxteam.utils.MyUtils

class CoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_core)

        CommonClass.print1()
        MyUtils.print2()
    }
}