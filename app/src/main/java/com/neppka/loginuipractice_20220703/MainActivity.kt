package com.neppka.loginuipractice_20220703

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      회원 가입 창으로
        signUpBtn.setOnClickListener {
//            비행기 티켓을 발권(출발지 :this(MainActivity) -> 목적지(SignUpActivity)
            val myIntent = Intent(this, SignUpActivity::class.java)

//            실제 비행기를 출발
            startActivity(myIntent) //myIntent : 비행기 티켓을 들고 타는 느낌

        }

//        로그인 로직 실행
        loginBtn.setOnClickListener {
            val inputEmail = idEdt.text.toString()

            val myIntent = Intent(this, MainActivity2::class.java)

//            이메일이라는 수화물 들고 날라간다.
            myIntent.putExtra("email", inputEmail)
//            실제 비행기를 출발
            startActivity(myIntent) //myIntent : 비행기 티켓을 들고 타는 느낌
        }
    }
}