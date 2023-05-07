package com.example.plantshandbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plantshandbook.databinding.PlantItemBinding

class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PlantHolder>() {
    class PlantHolder(item: View): RecyclerView.ViewHolder(item){
        val binding=PlantItemBinding.bind(item)
        fun bind(plant: Plant)=with(binding){
            im.setImageResource(plant.imageId)
            tvTitle.text=plant.title


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder {
        val view= LayoutInflater.from(parent.context)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        TODO("Not yet implemented")
    }
}