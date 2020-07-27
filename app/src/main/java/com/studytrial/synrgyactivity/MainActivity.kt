package com.studytrial.synrgyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MainActivity::class.java.simpleName, "onCreate() Activity A Dijalankan")

        tv_actA.setOnClickListener {
            startActivity(Intent(applicationContext, ActivityB::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity::class.java.simpleName, "onStart() Activity A Dijalankan")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity::class.java.simpleName, "onResume() Activity A  Dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity::class.java.simpleName, "onPause() Activity A Dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity::class.java.simpleName, "onStop() Activity A Dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity::class.java.simpleName, "onDestroy() Activity A Dijalankan")
    }
}