package com.neppka.loginuipractice_20220703

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.signUpBtn
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

//        회원 가입 버튼 눌렀을때의 로직 작성
        signUpBtn.setOnClickListener {
//            회원 가입시 서버와 통신하는 API 로직

            Toast.makeText(this, "${nickEdt.text}님 회원가입을 축하합니다.", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}