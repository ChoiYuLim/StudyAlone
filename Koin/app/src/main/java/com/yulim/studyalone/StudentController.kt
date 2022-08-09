package com.yulim.studyalone

class StudentController(val schoolService: SchoolService) {
    fun print() {
        println("현재 재학 중인 학교 : ${schoolService.schoolName}")
    }
}