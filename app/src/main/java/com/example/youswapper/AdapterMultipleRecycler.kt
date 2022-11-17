package com.example.youswapper

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterMultipleRecycler(private val list : List<ItemModelMultiple>) : RecyclerView.Adapter<AdapterMultipleRecycler.ViewHolderMultiple>() {
    var isSelectedMode : Boolean = false

    var isSeleccted = ArrayList<ItemModelMultiple>()

    inner class ViewHolderMultiple(Itemview : View) : RecyclerView.ViewHolder(Itemview){
        val imageView: ImageView = itemView.findViewById(R.id.image)
        val textView : TextView = itemView.findViewById(R.id.textview_item)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMultiple {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cardview_multiple_design,parent,false)
        return ViewHolderMultiple(view)
    }

    override fun onBindViewHolder(holder: ViewHolderMultiple, position: Int) {
        val ItemModelMultiple = list[position]

        holder.imageView.setImageResource(ItemModelMultiple.image)
        holder.textView.text = ItemModelMultiple.text
        holder.itemView.setOnClickListener(View.OnClickListener {
          if(isSeleccted.contains(list.get(position))){
              holder.itemView.setBackgroundColor(Color.WHITE)
              isSeleccted.remove(list.get(position))
          }
            else{
                holder.itemView.setBackgroundColor(R.drawable.corner_multiple_layout)
                isSeleccted.add(list.get(position))
          }
        })
    }

    override fun getItemCount(): Int {
        return list.size
    }
}