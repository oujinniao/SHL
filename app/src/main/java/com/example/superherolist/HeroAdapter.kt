package com.example.superherolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_superhero.* // Considera volver a agregar si la refactorización causa problemas

class HeroAdapter(val superhero: List<SuperHero>) : RecyclerView.Adapter<HeroAdapter.HeroHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount(): Int = superhero.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])
    }

    class HeroHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun render(superhero: SuperHero) {

            view.findViewById(R.id.tvRealname)?.text = superhero.realName
            view.findViewById(R.id.tvSuperHeroName)?.text = superhero.superHeroName
            view.findViewById(R.id.tvPublisher)?.text = superhero.publisher
            Picasso.get().load(superhero.image).into(view.ivHero)
        }
    }
}