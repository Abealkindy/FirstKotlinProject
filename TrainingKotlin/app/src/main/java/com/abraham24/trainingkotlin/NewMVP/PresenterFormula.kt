package com.abraham24.trainingkotlin.NewMVP

import android.widget.Toast
import com.abraham24.trainingkotlin.MVP.Interfaces.PresenterView

/**
 * Created by KOCHOR on 8/21/2017.
 */
class PresenterFormula {
    var presenterView: PresenterViewFormula? = null

    constructor(presenterView: PresenterViewFormula?) {
        this.presenterView = presenterView
    }

    fun hitungSegitiga(nilai111: String, nilai222: String) {
        if (nilai111.isNotEmpty() && nilai222.isNotEmpty()) {

            val x = nilai111.toDouble()
            val y = nilai222.toDouble()

            val hasil = (x * y) / 2
            presenterView?.hasils(hasil.toString())


        } else {

        }
    }

    fun hitungPersegi(nilai1: String) {
        if (nilai1.isNotEmpty()) {

            val x = nilai1.toDouble()

            val hasil = x * x
            presenterView?.hasils(hasil.toString())


        } else {

        }
    }

    fun hitungPersegiPanjang(nilai11: String, nilai22: String) {
        if (nilai11.isNotEmpty() && nilai22.isNotEmpty()) {

            val x = nilai11.toDouble()
            val y = nilai22.toDouble()

            val hasil = x * y
            presenterView?.hasils(hasil.toString())


        } else {

        }
    }


}