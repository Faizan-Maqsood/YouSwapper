package com.example.youswapper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        val data = ArrayList<ItemModel>()

        recyclerview.layoutManager = GridLayoutManager(this, 2)


        data.add(
            ItemModel(
                R.drawable.boot,
                "Nike Air Max 20",
                "Best shoes for Jogging. It is great pleasure to wear it while playing the game. One would feel relax and comfort during game"
            )
        )
        data.add(
            ItemModel(
                R.drawable.running,
                "Nike Air Max 21",
                "Best shoes for Running, it is fit to foot. it is comfortable shoes"
            )
        )
        data.add(
            ItemModel(
                R.drawable.cricket,
                "Nike Air Max 22",
                "Best shoes for Cricket, as this game requires a continous running so it is best to wear this shoes "
            )
        )
        data.add(
            ItemModel(
                R.drawable.hockey,
                "Nike Air Max 23",
                "Best shoes for Hockey"
            )
        )
        data.add(
            ItemModel(
                R.drawable.soccer,
                "Nike Air Max 24",
                "Best shoes for Soccer, it is played in europe mostly. soccer needs continous running for a long half. it comforts the foot in soccer playing"
            )
        )
        data.add(
            ItemModel(
                R.drawable.badminton,
                "Nike Air Max 25",
                "Best shoes for Badminton. badminton needs strong grip of footing with quick movements."
            )
        )
        data.add(
            ItemModel(
                R.drawable.squash,
                "Nike Air Max 26",
                "Best shoes for Squash. squash is a game of intrest for the few people. "
            )
        )
        data.add(
            ItemModel(
                R.drawable.walking,
                "Nike Air Max 27",
                "Best shoes for Walking. walking is the hobby of many people. people walk for the long period either int the morning or in the evening. it relaxes the foot for a long period of time"
            )
        )


        val adapter = CustomAdapter(data)
        recyclerview.adapter = adapter



    }





}


