package com.neppka.loginuipractice_20220703

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        signUpBtn.setOnClickListener {
            Toast.makeText(this, "회원가입버튼 클릭", Toast.LENGTH_SHORT).show()
        }

        loginBtn.setOnClickListener {
            Log.d("메인 액티비티", "로그인 버튼 클릭")
        }

//        로그인 로직 실행
        loginBtn.setOnClickListener {
            val id = idEdt.text.toString()
            val pwd = passEdt.text.toString()

            if(id == "admin" || pwd == "asdf") {
                if(id != "admin") {
                    Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
                } else if(pwd != "asdf") {
                    Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "로그인이 실패했습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}