package com.labactivity.dishcovery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.labactivity.dishcovery.databinding.ActivityIngredientsBinding

class Ingredients : AppCompatActivity() {

    private lateinit var binding: ActivityIngredientsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var resi1 = intent.getStringExtra("ReciName1").equals("Details1")
        var resi2 = intent.getStringExtra("ReciName2").equals("Details2")
        var resi3 = intent.getStringExtra("ReciName3").equals("Details3")
        var resi4 = intent.getStringExtra("ReciName4").equals("Details4")

        if (resi1) {
            binding.imageView.setImageResource(R.drawable.waff)
            binding.title.setText("Waffle")
            binding.recipee.setText(Details1())

        } else if (resi2) {
            binding.imageView.setImageResource(R.drawable.frencht)
            binding.title.setText("French Toast")
            binding.recipee.setText(Details2())
        } else if(resi3) {
            binding.imageView.setImageResource(R.drawable.ome)
            binding.title.setText("Omelette")
            binding.recipee.setText(Details3())
        } else if(resi4) {
            binding.imageView.setImageResource(R.drawable.smoothiebowl)
            binding.title.setText("Smoothie Bowl")
            binding.recipee.setText(Details4())
        }
    }

    fun Details1():String{
        val dets: String = "Salt air, and the rust on your door"
        return dets
    }

    fun Details2():String{
        val dets: String = "Untouchable like a distant diamond sky\n"
        return dets
    }

    fun Details3():String{
        val dets: String = "The moon is high\n"
        return dets
    }

    fun Details4():String{
        val dets: String = "And be my mistake\n"
        return dets
    }
}