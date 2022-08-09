package com.yulim.studyalone

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/*
    Application() 클래스를 상속받은 클래스에서 startKoin 메서드를 통해
    프로그램 내에 Kioin을 사용할 수 있도록 설정
 */

class MyApplication : Application() {
    @Override
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(applicationContext)
            modules(appModule)
        }
    }
}