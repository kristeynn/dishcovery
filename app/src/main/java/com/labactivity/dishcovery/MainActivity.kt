package com.labactivity.dishcovery

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.google.firebase.auth.FirebaseAuth
import com.labactivity.dishcovery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // waffle recipe
        binding.rep1btn.setOnClickListener(){
            gotoIngredients("Waffle")
        }

        //Chicken caesar
        binding.rep2btn.setOnClickListener(){
            gotoIngredients("Caesar")
        }

        //Chicken Parmesan
        binding.rep3btn.setOnClickListener(){
            gotoIngredients("Parmesan")
        }

        //Mozarella Sticks

        binding.rep4btn.setOnClickListener(){
            gotoIngredients("Sticks")
        }


        binding.breakfastbtn.setOnClickListener() {
            gotoactivity("breakfastbtn")
        }

        binding.lunchbtn.setOnClickListener() {
            gotoactivity("lunchbtn")
        }
        binding.dinnerbtn.setOnClickListener() {
            gotoactivity("dinnerbtn")
        }

        binding.snackbtn.setOnClickListener() {
            gotoactivity("snackbtn")
        }

    }

    fun gotoactivity(buttonName: String) {
        val intent = Intent(this, recipesection::class.java)
        intent.putExtra("buttonName", buttonName)
        startActivity(intent)
    }

    fun gotoIngredients(buttonName: String) {
        val intent = Intent(this, Ingredients::class.java)
        intent.putExtra("buttonName", buttonName)
        startActivity(intent)
    }
}