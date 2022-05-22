package com.riteh.autoshare.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.riteh.autoshare.R
import com.riteh.autoshare.data.dataholders.CarListItem
import kotlinx.android.synthetic.main.car_layout.view.*

class CarListAdapter(private var cars: List<CarListItem>, val context: Context) :
    RecyclerView.Adapter<CarListAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.car_layout, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.carName.text = "new car"
        holder.carPrice.text = "1000"
        holder.carStar.text = "10"

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val carPrice: TextView = itemView.car_price
        val carName: TextView = itemView.car_name
        val carStar: TextView = itemView.car_star
        val carPicture: ImageView = itemView.picture_car

        init {}
    }
}