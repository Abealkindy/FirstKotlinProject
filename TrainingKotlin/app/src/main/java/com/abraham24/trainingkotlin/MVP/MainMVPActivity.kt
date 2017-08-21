package com.abraham24.trainingkotlin.MVP

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.abraham24.trainingkotlin.MVP.Interfaces.PresenterView
import kotlinx.android.synthetic.main.activity_hitung_bangun_datar.*

import com.abraham24.trainingkotlin.R

class MainMVPActivity : AppCompatActivity(), PresenterView {

    var presenter: Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_bangun_datar)

        button_hitung.setOnClickListener {

        presenter?.hitung(edit_text_1?.text.toString(), edit_text_2?.text.toString())

        }
    }

    override fun onStart() {
        super.onStart()

        presenter = Presenter(this)
    }

    override fun hasil(nilai: String) {
        text_hasil.text = nilai
    }
}
