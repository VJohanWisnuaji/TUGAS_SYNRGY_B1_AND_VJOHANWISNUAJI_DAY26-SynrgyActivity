package com.studytrial.synrgyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_b.*


class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d(ActivityB::class.java.simpleName, "onCreate() Activity B Dijalankan")

        tv_actB.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(ActivityB::class.java.simpleName, "onStart() Activity B Dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.d(ActivityB::class.java.simpleName, "onResume() Activity B  Dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.d(ActivityB::class.java.simpleName, "onPause() Activity B Dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.d(ActivityB::class.java.simpleName, "onStop() Activity B Dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ActivityB::class.java.simpleName, "onDestroy() Activity B Dijalankan")
    }
}