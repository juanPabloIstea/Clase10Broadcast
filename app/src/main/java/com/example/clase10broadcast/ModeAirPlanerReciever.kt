package com.example.clase10broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ModeAirPlanerReciever: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isModeAirPlane = intent?.getBooleanExtra("state", false) ?: return

        if (isModeAirPlane) {
            Toast.makeText(context, "MODO AVION ACTIVADO", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "MODO AVION DESACTIVADO", Toast.LENGTH_LONG).show()
        }
    }
}