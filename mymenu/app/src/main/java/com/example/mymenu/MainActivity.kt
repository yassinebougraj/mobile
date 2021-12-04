package com.example.mymenu

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymenu.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding
    lateinit var repas:ArrayList<Repas>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imgid= intArrayOf(
            R.drawable.pizza,R.drawable.plat,R.drawable.spa,R.drawable.vur
        )
        val nom = arrayOf(
            "Pizza","Plat","Spaguiti","Burger"
        )
        val prix = arrayOf(
            "45,00","30,00","35,00","40,00"
        )

        repas= ArrayList()
        for ( i in nom.indices){

            val repa=Repas(imgid[i], nom[i], prix[i] )
            repas.add(repa)
        }

        binding.listt.isClickable=true
        binding.listt.adapter=MyAdapter(this,R.layout.liste,repas)
        binding.listt.setOnItemClickListener { parent, view, position, id ->
            val nom=nom[position]
            val imgid=imgid[position]
            val prix =prix[position]



        }



    }
}