package com.yulim.studyalone

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/*
    Application() 클래스를 상속받은 클래스에서 startKoin 메서드를 통해
    프로그램 내에 Kioin을 사용할 수 있도록 설정
    androidLogger(): AndroidLogger를 Koin logger로 사용
    androidContext(...): 해당 안드로이드 context를 사용
    modules(...): 사용할 모듈을 등록
 */

class MyApplication : Application() {
    @Override
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            androidContext(applicationContext)
            modules(appModule)
        }
    }
}