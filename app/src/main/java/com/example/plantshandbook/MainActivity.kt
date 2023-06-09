package com.example.plantshandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.plantshandbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter=PlantAdapter()
    private val imageIdList=listOf(
        R.drawable.flower1,
        R.drawable.flower2,
        R.drawable.flower3,
        R.drawable.flower4,
        R.drawable.flower5)
    private var index=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init()=with(binding){
        binding.apply{
            rcView.layoutManager=GridLayoutManager(this@MainActivity,3)
            rcView.adapter=adapter
            buttonAdd.setOnClickListener{
                if(index>4) index=0
                val plant=Plant(imageIdList[index], "Flower $index")
                adapter.addPlant(plant)
                index++
            }
        }
    }
}