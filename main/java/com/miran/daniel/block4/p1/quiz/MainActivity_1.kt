package com.miran.daniel.block4.p1.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etEm: EditText
    private lateinit var etPw: EditText
    private lateinit var btsu: Button
    private lateinit var mybt: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        etEm = findViewById(R.id.et_email)
        etPw = findViewById(R.id.et_password)
        mybt = findViewById(R.id.bt_login)
        btsu = findViewById(R.id.bt_su)

        mybt.setOnClickListener {
            val username = etEm.text.toString()
            val password = etPw.text.toString()

            if (username == "hello") {
                if (password == "123") {
                    Toast.makeText(this@MainActivity,"Login Successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@MainActivity, MainActivity::class.java)
                    startActivity(intent)
                }
            }
            else {
                Toast.makeText(this@MainActivity, "Login Failed: Invalid Credentials", Toast.LENGTH_SHORT).show()
            }

            btsu.setOnClickListener {
                Toast.makeText(this@MainActivity,"Create Account", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
        }
    }
}