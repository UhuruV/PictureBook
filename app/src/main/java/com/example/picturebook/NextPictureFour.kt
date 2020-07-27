package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next_picture_four.*

class NextPictureFour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_picture_four)

        btPreviousFour.setOnClickListener {
            val intent = Intent(baseContext, NextPictureThree::class.java)
        }
    }
}