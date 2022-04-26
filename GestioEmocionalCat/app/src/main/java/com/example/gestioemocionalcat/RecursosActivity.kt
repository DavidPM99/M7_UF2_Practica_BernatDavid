package com.example.gestioemocionalcat

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recursos.*

class RecursosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recursos)

        configView()
    }

    private fun configView() {
        bt_061.setOnClickListener {
            dialNumber("061")
        }

        bt_112.setOnClickListener {

        }

        bt_012.setOnClickListener {

        }
    }

    private fun dialNumber(phoneNumber: String) {
        startActivity(Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        })
    }
}
