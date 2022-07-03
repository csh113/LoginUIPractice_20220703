package com.neppka.loginuipractice_20220703

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Toast.makeText(this, "로그인 페이지", Toast.LENGTH_SHORT).show()

        val email = intent.getStringExtra("email")

        emailTxt.text = email
    }
}