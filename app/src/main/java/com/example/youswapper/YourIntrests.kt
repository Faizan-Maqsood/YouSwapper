package com.example.youswapper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class YourIntrests : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_intrests)

        val recyclerviewmultiple = findViewById<RecyclerView>(R.id.recyclerviewmultiple)

        val listdata = ArrayList<ItemModelMultiple>()

        recyclerviewmultiple.layoutManager = GridLayoutManager(this, 2)

        listdata.add(ItemModelMultiple(R.drawable.vectorcamera, "Photography"))
        listdata.add(ItemModelMultiple(R.drawable.vectormic, "Karaoke"))
        listdata.add(ItemModelMultiple(R.drawable.vactorcook, "Cooking"))
        listdata.add(ItemModelMultiple(R.drawable.vectorrun, "Run"))
        listdata.add(ItemModelMultiple(R.drawable.vectorart, "Art"))
        listdata.add(ItemModelMultiple(R.drawable.vectorextreme, "Extreme"))
        listdata.add(ItemModelMultiple(R.drawable.vectordrink, "Drink"))
        listdata.add(ItemModelMultiple(R.drawable.vectorshoping, "Shopping"))
        listdata.add(ItemModelMultiple(R.drawable.vectoryoga, "Yoga"))
        listdata.add(ItemModelMultiple(R.drawable.vectortennis, "Tennis"))
        listdata.add(ItemModelMultiple(R.drawable.vectorswimming, "Swimming"))
        listdata.add(ItemModelMultiple(R.drawable.vectortravel, "Travelling"))
        listdata.add(ItemModelMultiple(R.drawable.vectormusic, "Music"))
        listdata.add(ItemModelMultiple(R.drawable.vectorgame, "Video Games"))


        val adapter = AdapterMultipleRecycler(listdata)
        recyclerviewmultiple.adapter = adapter
    }
}