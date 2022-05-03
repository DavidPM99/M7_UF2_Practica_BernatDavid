package com.example.gestioemocionalcat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_avaluacio.*

class AvaluacioActivity3 : AppCompatActivity() {

    lateinit var respostes: IntArray

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avaluacio3)

        respostes = intent.getIntArrayExtra(Constants.EXTRA_RESPOSTES)!!

        configView()
    }

    private fun configView() {
        bt_resposta1.setOnClickListener {
            greyAllButtons()
            it.setBackgroundResource(R.drawable.btn_rounded_blue)
            nextQuestion(1)
        }

        bt_resposta2.setOnClickListener {
            greyAllButtons()
            it.setBackgroundResource(R.drawable.btn_rounded_blue)
            nextQuestion(2)
        }

        bt_resposta3.setOnClickListener {
            greyAllButtons()
            it.setBackgroundResource(R.drawable.btn_rounded_blue)
            nextQuestion(3)
        }

        bt_resposta4.setOnClickListener {
            greyAllButtons()
            it.setBackgroundResource(R.drawable.btn_rounded_blue)
            nextQuestion(4)
        }
    }

    private fun greyAllButtons() {
        bt_resposta1.setBackgroundResource(R.drawable.btn_rounded_grey)
        bt_resposta2.setBackgroundResource(R.drawable.btn_rounded_grey)
        bt_resposta3.setBackgroundResource(R.drawable.btn_rounded_grey)
        bt_resposta4.setBackgroundResource(R.drawable.btn_rounded_grey)
    }

    private fun nextQuestion(resposta: Int) {
        respostes[2] = resposta

        startActivity(Intent(this, AvaluacioActivityFinal::class.java).apply {
            putExtra(Constants.EXTRA_RESPOSTES, respostes)
        })
    }
}
