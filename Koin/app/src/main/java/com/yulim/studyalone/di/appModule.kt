package com.yulim.studyalone

import com.yulim.studyalone.component.SchoolService
import com.yulim.studyalone.component.StudentController
import org.koin.dsl.module

/*
    Koin 라이브러리의 DSL을 활용하여 각 클래스 모듈을 생성
    DSL이란, Domain Specific Language 특정한 도메인을 적용하는데 특화된 언어
    module: 코틀린 모듈을 생성할 때 사용
    factory: 매번 inject 할 때마다 새로운 인스턴스 생성
    single: 전역적으로 사용 가능한 인스턴스를 생성 (싱글톤 생성)
    bind: 생성할 객체를 다른 타입으로 변환할 때 사용
    get: 필요로 하는 곳에 알맞게 의존성을 주입
    applicationContext: Context를 주입

    현재 appModule이라는 변수에 module 키워드를 사용하여 코틀린 모듈을 생성
    module 키워드 안에는 single 키워드와 factory 키워드를 사용해 생성한 클래스를 감싸고 있음
    SchoolService클래스는 생성자로 매개변수를 입력받지 않지만 StudentController 클래스는
    생성자로 매개변수를 입력 받기 때문에 get()을 쓴 것,
    get 키워드를 사용하여 알맞은 의존성 객체의 값을 주입하기 위함
 */

val appModule = module {
    single { SchoolService() }
    factory { StudentController(get()) }
}