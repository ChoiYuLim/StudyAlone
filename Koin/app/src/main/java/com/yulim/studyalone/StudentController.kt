package com.yulim.studyalone

/*
    생성자로 SchoolService 클래스의 인스턴스를 전달받고 있으며 print 메서드를 통해
    현재 재학 중인 학교의 이름을 출력한다.
 */

class StudentController(val schoolService: SchoolService) {
    fun print() {
        println("현재 재학 중인 학교 : ${schoolService.schoolName}")
    }
}