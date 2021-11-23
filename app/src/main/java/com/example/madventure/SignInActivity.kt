package com.example.madventure

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.madventure.databinding.ActivitySignInBinding

class SignInActivity : Activity() {

    lateinit var email: EditText
    lateinit var password: EditText
    private lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }

    fun signin(view:View){
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()){
            val intent = Intent(this,ResultActivity::class.java)
            startActivity(intent)
        }else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("Заполните все поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }
}