package com.yulim.studyalone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yulim.studyalone.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

/*
    두개의 클래스가 자료형인 각각의 멤버 변수를 만든 뒤 by inject()를 통해 의존성 주입
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val schoolService: SchoolService by inject()
    private val studentController: StudentController by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        schoolService.moveSchool("광운대학교")
        studentController.print()
        binding.tvSchool.text = studentController.schoolService.schoolName
    }
}