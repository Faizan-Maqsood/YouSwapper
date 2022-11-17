package com.example.youswapper

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val mlist : List<ItemModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    inner class ViewHolder(Itemview : View) : RecyclerView.ViewHolder(Itemview){
        val imageViewboot: ImageView = itemView.findViewById(R.id.imageboot)
        val textViewnike : TextView = itemView.findViewById(R.id.textviewnike)
        val textViewdetail : TextView = itemView.findViewById(R.id.textviewdetail)
        val buttonswap : Button = itemView.findViewById(R.id.buttonswap)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)
         return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemModel = mlist[position]
        holder.imageViewboot.setImageResource(ItemModel.image)
        holder.textViewnike.text = ItemModel.text1
        holder.textViewdetail.text = ItemModel.text2
        holder.buttonswap.setOnClickListener(View.OnClickListener {
         //    onItemclick?.invoke(ItemModel)

            var image : Int= ItemModel.image
            val intent = Intent(holder.itemView.context, DetailSwap::class.java)
            //listener?.onClick(AlbumsData)

            intent.putExtra("Title", ItemModel.text1)
            intent.putExtra("description", ItemModel.text2)
            intent.putExtra("Image", image)
            holder.itemView.context.startActivity(intent)
        })
    }
    override fun getItemCount(): Int {
        return mlist.size
    }
}