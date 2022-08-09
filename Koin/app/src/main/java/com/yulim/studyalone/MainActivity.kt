package com.yulim.studyalone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yulim.studyalone.databinding.ActivityMainBinding
import org.koin.android.ext.android.inject

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