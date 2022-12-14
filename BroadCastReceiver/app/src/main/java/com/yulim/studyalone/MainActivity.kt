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
        질문: 주석 처리한 상태로 돌리면 onPause(), onStop() 상태에서는 Toast 안뜨지만 onCreate에 위의 코드를 같이 넣으면 onPause(), onStop() 상태에도 전부 Toast 뜬다. 왜?
        -> 이유: 똑같이 br을 사용했기 때문, registerReceiver(br, filter)를 두번 호출했는데 unregisterReceiver(br)은 한번 호출했기 때문에 하나가 등록 해제가 안돼서.

        동적 리시버를 사용했기 때문에 onDestroy() 될 때까지 Receiver는 유효하지만, 여기서는 onPause() 함수 안에 unregisterReceiver를 했기 때문에 Receiver 해제함

        *구글링한 결과 안드로이드 8.0부터는 정적 리시버를 사용할 수 없게 되었다. 정적 리시버가 아닌 동적 리시버로 구현해야한다.

        Android 8.0
        Beginning with Android 8.0 (API level 26), the system imposes additional restrictions on manifest-declared receivers.
        If your app targets Android 8.0 or higher, you cannot use the manifest to declare a receiver for most implicit broadcasts (broadcasts that don't target your app specifically).
        You can still use a context-registered receiver when the user is actively using your app.
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