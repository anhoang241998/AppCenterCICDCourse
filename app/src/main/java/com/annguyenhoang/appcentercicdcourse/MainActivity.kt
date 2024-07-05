package com.annguyenhoang.appcentercicdcourse

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var changeNameEdt: EditText
    private lateinit var greetingTv: TextView
    private lateinit var changeNameBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        changeNameBtn = findViewById(R.id.btn_change_name)
        greetingTv = findViewById(R.id.tv_helloworld)
        changeNameEdt = findViewById(R.id.edt_name)

        changeNameBtn.setOnClickListener {
            greetingTv.text = "Hello ${changeNameBtn.text}"
        }
    }
}