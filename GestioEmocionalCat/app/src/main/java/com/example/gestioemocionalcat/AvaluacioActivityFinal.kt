package com.example.gestioemocionalcat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_avaluacio_final.*

class AvaluacioActivityFinal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avaluacio_final)

        configView(intent.getIntArrayExtra(Constants.EXTRA_RESPOSTES)!!.sum())
    }

    private fun configView(resultat: Int) {
        when {
            resultat <= Constants.SALUT_BE -> tv_resultat.setText(R.string.tv_resultat_be)
            resultat >= Constants.SALUT_MALAMENT -> tv_resultat.setText(R.string.tv_resultat_malament)
            else -> tv_resultat.setText(R.string.tv_resultat_regular)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.final_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_fet -> {
                startActivity(Intent(this, MainActivity::class.java).apply { })
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onBackPressed() {
    }
}
