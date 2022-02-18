package com.example.guitar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
        button4.setOnClickListener {
            val i = Intent(this, MainActivity3::class.java)
            startActivity(i)
        }
        button5.setOnClickListener {
            val i = Intent(this, MainActivity4::class.java)
            startActivity(i)
        }
        button6.setOnClickListener {
            val i = Intent(this, MainActivity5::class.java)
            startActivity(i)
        }
    }
}