package com.zmei.a29lessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.zmei.a29lessons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.bottomMenu.selectedItemId = R.id.item3
        binding.bottomMenu.setOnNavigationItemReselectedListener {
            when (it.itemId){
                R.id.item1 ->{
                    Toast.makeText(this, "Item1", Toast.LENGTH_SHORT).show()
                }
                R.id.item2 ->{
                    Toast.makeText(this, "Item2", Toast.LENGTH_SHORT).show()
                }
                R.id.item3 ->{
                    Toast.makeText(this, "Item3", Toast.LENGTH_SHORT).show()
                }
                R.id.item4 ->{
                    Toast.makeText(this, "Item4", Toast.LENGTH_SHORT).show()
                }

        }
            true
    }
}}