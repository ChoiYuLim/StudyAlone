package com.yulim.studyalone

import org.koin.dsl.module

val appModule = module {
    single { SchoolService() }
    factory { StudentController(get()) }
}