package com.geanbrandao.testfastlane

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AppCenter.start(application, "ec44cc45-f34f-4c8c-9d70-ab9d71acf740",
                Analytics::class.java, Crashes::class.java)

        setContentView(R.layout.activity_main)
    }
}