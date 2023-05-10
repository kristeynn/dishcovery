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
}