package com.miran.daniel.block4.p1.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity3: AppCompatActivity() {

    private lateinit var etcreate: EditText
    private lateinit var etpassword: EditText
    private lateinit var etpassword2: EditText
    private lateinit var btconfirm2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        etcreate = findViewById(R.id.et_signup_user)
        etpassword = findViewById(R.id.et_create_pw_01)
        etpassword2 = findViewById(R.id.et_create_pw_02)
        btconfirm2 = findViewById(R.id.bt_confirm2)

        btconfirm2.setOnClickListener {
            Toast.makeText(this@MainActivity3,"Signup Successful", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}