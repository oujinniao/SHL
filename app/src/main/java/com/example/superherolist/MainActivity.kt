package com.example.superherolist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var superheros: List<SuperHero> = listOf(
        SuperHero("Spiderman","Marvel","Peter Parker","https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"),
        SuperHero("Daredevil","Marvel","Mateo Murdock","https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"),
        SuperHero("Wolverine","Marvel","James Howlett","https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"),
        SuperHero("Batman","DC","Bruce Wayne","https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"),
        SuperHero("Thor","Marvel","Thor Odinson","https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"),
        SuperHero("Flash","DC","Jay Garrik","https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"),
        SuperHero("Linterna verde","DC","Alan Scott","https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"),
        SuperHero("Mujer Maravilla","DC","Isabela MontenegroZ","https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()


        fun initRecycler() {
            val rvSuperHero = findViewById<RecyclerView>(R.id.rvSuperHero)
            rvSuperHero.layoutManager = LinearLayoutManager(this)
        }
    }

    private fun initRecycler() {

    }
}


