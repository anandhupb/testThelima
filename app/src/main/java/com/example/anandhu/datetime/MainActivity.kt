package com.example.anandhu.datetime

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var calender: Calendar
    lateinit var simpleDateFormat: SimpleDateFormat
    lateinit var Date: String
    lateinit var dateTimeView: TextView
    lateinit var btnDateTime:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dateTimeView = findViewById(R.id.dateTimeView)
        btnDateTime = findViewById(R.id.btnDateTime)

        calender = Calendar.getInstance();
        simpleDateFormat = SimpleDateFormat("dd-MM-yyyy HH:mm:ss")
        Date = simpleDateFormat.format(calender.getTime())

        btnDateTime.setOnClickListener {
            Toast.makeText(this,Date,Toast.LENGTH_LONG).show()

        }

        }

    }

