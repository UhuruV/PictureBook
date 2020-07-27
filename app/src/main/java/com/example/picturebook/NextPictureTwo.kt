package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next_picture.*
import kotlinx.android.synthetic.main.activity_next_picture_two.*

class NextPictureTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_picture_two)

        btPreviousTwo.setOnClickListener {
            val intent = Intent(baseContext, NextPicture::class.java)
        }
        btNextTwo.setOnClickListener {
            val next= Intent(baseContext,NextPictureThree::class.java)
        }
    }
}