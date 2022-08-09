package com.yulim.studyalone

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var br: BroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        br = TestReceiver()
        var filter: IntentFilter = IntentFilter().apply {
            addAction(Intent.ACTION_POWER_CONNECTED)
            addAction(Intent.ACTION_POWER_DISCONNECTED)
        }
        registerReceiver(br, filter)
        */
        /*
        주석 처리한 상태로 돌리면 onPause(), onStop() 상태에서는 Toast 안뜨지만
        onCreate에 위의 코드를 같이 넣으면 onPause(), onStop() 상태에도 전부 Toast 뜬다. 왜??
         */
    }

    override fun onResume() {
        br = TestReceiver()
        var filter: IntentFilter = IntentFilter().apply {
            addAction(Intent.ACTION_POWER_CONNECTED)
            addAction(Intent.ACTION_POWER_DISCONNECTED)
        }
        registerReceiver(br, filter)
        super.onResume()
    }

    override fun onPause() {
        unregisterReceiver(br)
        super.onPause()
    }
}