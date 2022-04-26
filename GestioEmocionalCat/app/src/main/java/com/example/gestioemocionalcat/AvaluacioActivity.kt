package com.example.gestioemocionalcat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_avaluacio.*

class AvaluacioActivity : AppCompatActivity() {

    val respostes = IntArray(Constants.NUM_PREGUNTES)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avaluacio)

        displayAvis()
        configView()
    }

    private fun displayAvis() {
        val builder = AlertDialog.Builder(this@AvaluacioActivity).apply {
            setTitle(R.string.dialog_avís)
            setMessage(R.string.dialog_text)
            setPositiveButton(R.string.dialog_dacord) {dialog, which -> }
        }

        val dialog: AlertDialog = builder.create()
        dialog.show()
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
        respostes[0] = resposta

        startActivity(Intent(this, AvaluacioActivity2::class.java).apply {
            putExtra(Constants.EXTRA_RESPOSTES, respostes)
        })
    }
}
