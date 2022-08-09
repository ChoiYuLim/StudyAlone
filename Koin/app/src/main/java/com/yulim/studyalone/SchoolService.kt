package com.yulim.studyalone

/*
    schoolName이라는 멤버 변수를 가지며 moveSchool 메서드를 통해
    재학 중인 학교를 새로운 학교로 변경 가능
 */

class SchoolService {
    var schoolName = "양서고등학교"

    fun moveSchool(newSchoolName: String) {
        this.schoolName = newSchoolName
    }
}