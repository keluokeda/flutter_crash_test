package com.ke.fluttercrashtest

import android.content.Intent
import android.util.Log
import io.flutter.app.FlutterApplication

class App : FlutterApplication() {


    override fun onCreate() {
        super.onCreate()


        Log.e("TAG", "App onCreate ")
        val intent = Intent(this, RemoteService::class.java)
        startService(intent)


    }
}