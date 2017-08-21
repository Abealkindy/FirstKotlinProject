package com.abraham24.trainingkotlin.WithoutMVP

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.abraham24.trainingkotlin.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var tangkap = intent.getStringExtra("hasil")
        var tangkap2 = intent.getStringExtra("nilai_1")
        var tangkap3 = intent.getStringExtra("nilai_2")

        Toast.makeText(applicationContext, tangkap + " " + tangkap2 + " " + tangkap3, Toast.LENGTH_SHORT).show()
    }
}
