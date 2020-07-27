package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next_picture_three.*
import kotlinx.android.synthetic.main.activity_next_picture_two.*

class NextPictureThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_picture_three)

        btPreviousThree.setOnClickListener {
            val intent = Intent(baseContext, NextPictureTwo::class.java)
        }
        btNextThree.setOnClickListener {
            val next= Intent(baseContext,NextPictureFour::class.java)
        }
    }
}