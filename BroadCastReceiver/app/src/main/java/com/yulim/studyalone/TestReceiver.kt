package com.yulim.studyalone

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TestReceiver : BroadcastReceiver() {

    //intent에 해당 Reciver 넣어서 sendBroadCast 하면 해당 Reciver를 받을 수 있는 앱이 받고 onReceive 동작을 함
    override fun onReceive(context: Context?, intent: Intent?) {
        if (Intent.ACTION_POWER_CONNECTED.equals(intent!!.action)) {
            Toast.makeText(context, "전원연결", Toast.LENGTH_SHORT).show()
        } else if (Intent.ACTION_POWER_DISCONNECTED.equals(intent.action)) {
            Toast.makeText(context, "전원 연결 해제", Toast.LENGTH_SHORT).show()
        }
    }
}