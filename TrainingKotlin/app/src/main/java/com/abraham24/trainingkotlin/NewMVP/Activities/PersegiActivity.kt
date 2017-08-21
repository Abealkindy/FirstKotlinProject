package com.abraham24.trainingkotlin.NewMVP.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.abraham24.trainingkotlin.NewMVP.PresenterFormula
import com.abraham24.trainingkotlin.NewMVP.PresenterViewFormula
import kotlinx.android.synthetic.main.activity_hitung_bangun_datar.*

import com.abraham24.trainingkotlin.R
import kotlinx.android.synthetic.main.activity_persegi.*

class PersegiActivity : AppCompatActivity(), PresenterViewFormula {


    var presenterFormula: PresenterFormula? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)

        button_hitung_luas_persegi.setOnClickListener {
            presenterFormula?.hitungPersegi(edit_text_sisi?.text.toString())
        }


    }

    override fun onStart() {
        super.onStart()

        presenterFormula = PresenterFormula(this)
    }

    override fun hasils(nilais: String) {
        text_hasil_persegi.text = nilais
    }
}
