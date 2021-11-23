package com.example.madventure

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.madventure.databinding.ActivityResultBinding

class ResultActivity : Activity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
fun take_result(view:View){
    Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show()
}

}