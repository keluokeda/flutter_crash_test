package com.ke.fluttercrashtest

import android.app.Service
import android.content.Intent
import android.os.IBinder

class RemoteService : Service() {

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}
