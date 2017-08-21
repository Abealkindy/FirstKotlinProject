package com.abraham24.trainingkotlin.MVP

import com.abraham24.trainingkotlin.MVP.Interfaces.PresenterView


/**
 * Created by KOCHOR on 8/21/2017.
 */
class Presenter {

    var presenterView : PresenterView? = null

    constructor(presenterView: PresenterView?) {
        this.presenterView = presenterView
    }


    fun hitung (nilai1 : String, nilai2 : String){
        if (nilai1.isNotEmpty() && nilai2.isNotEmpty()) {

            val x = nilai1.toDouble()
            val y = nilai2.toDouble()

            val hasil = (x * y) / 2
            presenterView?.hasil(hasil.toString())

//            text_hasil?.text = hasil.toString()

        } else {
//            val alert = AlertDialog.Builder(this)
//            alert.setMessage("gk boleh kosong bro")
//                    .setIcon(R.mipmap.ic_launcher)
//                    .setPositiveButton("yes", DialogInterface.OnClickListener { dialogInterface, i ->
//                        dialogInterface.dismiss()
//                    })
//                    .show()
        }
    }
}