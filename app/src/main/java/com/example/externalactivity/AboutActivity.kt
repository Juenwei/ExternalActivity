package com.example.externalactivity

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_acitivity)

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
        {
            val actionbar = supportActionBar

            actionbar!!.title = "Detail"
            actionbar!!.setDisplayHomeAsUpEnabled(true)

        }
        val btnC = findViewById<Button>(R.id.buttonC)

        val name = intent.getStringExtra("StudentName")

        val tv = findViewById<TextView>(R.id.tvText)
        tv.text = name

        btnC.setOnClickListener(){

            val intent: Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}