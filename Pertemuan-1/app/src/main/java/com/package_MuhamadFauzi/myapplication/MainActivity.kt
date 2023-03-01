package com.package_MuhamadFauzi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_login : Button = findViewById(R.id.btn_login)


        button_login.setOnClickListener {
            //ngapain...
            Toast.makeText(this@MainActivity, "Login Success", Toast.LENGTH_SHORT).show()

        }
    }
}