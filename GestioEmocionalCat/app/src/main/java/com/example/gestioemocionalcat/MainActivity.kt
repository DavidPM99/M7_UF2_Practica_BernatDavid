package com.example.gestioemocionalcat

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configView()
    }

    private fun configView() {
        bt_avalua.setOnClickListener {
            startActivity(Intent(this, AvaluacioActivity::class.java))
        }

        bt_recursos.setOnClickListener {
            startActivity(Intent(this, AvaluacioActivity::class.java))
        }

        tv_sobre.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(Constants.URI_GESTIO_EMOCIONAL)))
        }
    }

    override fun onBackPressed() {
    }
}
