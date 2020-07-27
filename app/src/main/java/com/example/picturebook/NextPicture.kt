package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_next_picture.*

class NextPicture : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_picture)

        button5.setOnClickListener {
            val intent = Intent(baseContext, MainActivity::class.java)
        }
        button6.setOnClickListener {
            val next=Intent(baseContext,NextPictureTwo::class.java)
        }
        }
    }
