package com.example.externalactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnA:Button = findViewById(R.id.buttonA)
        val btnB:Button = findViewById(R.id.buttonB)

        btnA.setOnClickListener()
        {
            val studName :String = "Ali"
            val intent: Intent = Intent(this,AboutActivity::class.java)
            intent.putExtra("StudentName",studName)
            startActivity(intent)
        }

        btnB.setOnClickListener(){
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel: 999")
            //val intent = Intent(Intent.ACTION_VIEW)
            //intent.data = Uri.parse("geo: 3.1390 ,101.6869")
            startActivity(intent)
        }
    }
}