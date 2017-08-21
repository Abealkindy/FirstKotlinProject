package com.abraham24.trainingkotlin.NewMVP.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mvpformula.*
import com.abraham24.trainingkotlin.R

class MVPFormulaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvpformula)

        button_pindah_persegi.setOnClickListener {

            startActivity(Intent(applicationContext, PersegiActivity::class.java))
        }
        button_pindah_persegi_panjang.setOnClickListener {

            startActivity(Intent(applicationContext, PersegiPanjangActivity::class.java))
        }
        button_pindah_segitiga.setOnClickListener {

            startActivity(Intent(applicationContext, SegiTigaActivity::class.java))
        }
    }
}
