package com.example.youswapper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailSwap : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_swap)

        val button_swap : Button = findViewById(R.id.button_swapdetail)
        val textView_about: TextView = findViewById(R.id.textview_about)
        val textView_des: TextView = findViewById(R.id.textview_mydetail)
        val image_detail : ImageView = findViewById(R.id.image_bootdetail)

        val title = intent.getStringExtra("Title")
        Log.d("Title", "${title}")
        val des = intent.getStringExtra("description")
        Log.d("description", "${des}")
        val image = intent.getIntExtra("Image", 0)
       // Log.d("Image", "${image}")

        textView_about.setText(title)
        textView_des.setText(des)
        image_detail.setImageResource(image)

        button_swap.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@DetailSwap, YourIntrests::class.java)
            startActivity(intent)
        })
    }


}


