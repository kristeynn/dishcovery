package com.labactivity.dishcovery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.dishcovery.databinding.ActivityRecipesectionBinding

class recipesection : AppCompatActivity() {
    private lateinit var binding: ActivityRecipesectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipesectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonName = intent.getStringExtra("buttonName")
        if (buttonName == "breakfastbtn") {
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.bfsection)
            binding.repcipeopt1btn.setImageResource(R.drawable.waffle)
            binding.repcipeopt1btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName1", "Details1")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.bfsection)
            binding.repcipeopt2btn.setImageResource(R.drawable.frenchtst)
            binding.repcipeopt2btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName2", "Details2")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.bfsection)
            binding.repcipeopt3btn.setImageResource(R.drawable.omelette)
            binding.repcipeopt3btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName3", "Details3")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.bfsection)
            binding.repcipeopt4btn.setImageResource(R.drawable.smoothie)
            binding.repcipeopt4btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName4", "Details4")
                startActivity(intent)
            }
        } else if (buttonName == "lunchbtn") {
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.lunchsect)
            // add click listeners for lunch recipes
            binding.repcipeopt1btn.setImageResource(R.drawable.pastasld)
            binding.repcipeopt1btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName1", "Details1")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.lunchsect)
            binding.repcipeopt2btn.setImageResource(R.drawable.quesadilla)
            binding.repcipeopt2btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName2", "Details2")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.lunchsect)
            binding.repcipeopt3btn.setImageResource(R.drawable.fishtacs)
            binding.repcipeopt3btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName3", "Details3")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.lunchsect)
            binding.repcipeopt4btn.setImageResource(R.drawable.chickencaesar)
            binding.repcipeopt4btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName4", "Details4")
                startActivity(intent)
            }


        } else if (buttonName == "dinnerbtn") {
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.dinnersect)
            // add click listeners for dinner recipes
            binding.repcipeopt1btn.setImageResource(R.drawable.steakdinner)
            binding.repcipeopt1btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName1", "Details1")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.dinnersect)
            binding.repcipeopt2btn.setImageResource(R.drawable.potroast)
            binding.repcipeopt2btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName2", "Details2")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.dinnersect)
            binding.repcipeopt3btn.setImageResource(R.drawable.chickenparmesan)
            binding.repcipeopt3btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName3", "Details3")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.dinnersect)
            binding.repcipeopt4btn.setImageResource(R.drawable.grilledsamon)
            binding.repcipeopt4btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName4", "Details4")
                startActivity(intent)
            }


        } else if (buttonName == "snackbtn") {
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.snacksection)
            // add click listeners for snack recipes

            binding.repcipeopt1btn.setImageResource(R.drawable.mozarella)
            binding.repcipeopt1btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName1", "Details1")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.snacksection)
            binding.repcipeopt2btn.setImageResource(R.drawable.mojos)
            binding.repcipeopt2btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName2", "Details2")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.snacksection)
            binding.repcipeopt3btn.setImageResource(R.drawable.corndog)
            binding.repcipeopt3btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName3", "Details3")
                startActivity(intent)
            }
            binding.imageView.setImageResource(R.drawable.dishcoveryblk)
            binding.sectionview.setImageResource(R.drawable.snacksection)
            binding.repcipeopt4btn.setImageResource(R.drawable.spinachdip)
            binding.repcipeopt4btn.setOnClickListener {
                val intent = Intent(this, Ingredients::class.java)
                intent.putExtra("ReciName4", "Details4")
                startActivity(intent)
            }
        }
    }
}





