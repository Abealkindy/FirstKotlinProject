package com.abraham24.trainingkotlin.WithoutMVP

import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import com.abraham24.trainingkotlin.R
import kotlinx.android.synthetic.main.activity_hitung_bangun_datar.*

class HitungBangunDatar : AppCompatActivity() {

//    var editText1: EditText? = null
//    var editText2: EditText? = null
//    var textView: TextView? = null
//    var button_hitung: Button? = null
//    var button_pindah: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_bangun_datar)

//        editText1 = findViewById(R.id.edit_text_1) as EditText?
//        editText2 = findViewById(R.id.edit_text_2) as EditText?
//        textView = findViewById(R.id.text_hasil) as TextView?
//        button_hitung = findViewById(R.id.button_hitung) as Button?
//        button_pindah = findViewById(R.id.button_pindah) as Button?

        button_hitung?.setOnClickListener {

            val nilai1 = edit_text_1?.text.toString()
            val nilai2 = edit_text_2?.text.toString()

            if (nilai1.isNotEmpty() && nilai2.isNotEmpty()) {

                val x = nilai1.toDouble()
                val y = nilai2.toDouble()
                val hasil = (x * y) / 2

//                textView?.setText("Hasilnya : " + hasil)
                text_hasil?.text = hasil.toString()

            } else {
                val alert = AlertDialog.Builder(this)
                alert.setMessage("gk boleh kosong bro")
                        .setIcon(R.mipmap.ic_launcher)
                        .setPositiveButton("yes", DialogInterface.OnClickListener { dialogInterface, i ->
                            dialogInterface.dismiss()
                        })
                        .show()
            }

        }

        button_pindah?.setOnClickListener {

            var intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("nilai_1", edit_text_1?.text.toString())
                    .putExtra("nilai_2", edit_text_2?.text.toString())
                    .putExtra("hasil", text_hasil?.text)
            startActivity(intent)
//            startActivity(Intent(this ,))
        }
//
    }
}
