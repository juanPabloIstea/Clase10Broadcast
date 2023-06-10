package com.example.clase10broadcast

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var reciever: ModeAirPlanerReciever
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reciever = ModeAirPlanerReciever()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(reciever, it)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(reciever)
    }
}