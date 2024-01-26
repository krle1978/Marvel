package com.atvss.marvellist.views

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.atvss.marvellist.R
import com.atvss.marvellist.data.Hero
import com.bumptech.glide.Glide

class HeroesAdapter(
    private val heroes: ArrayList<Hero>,
    private val onItemClick: (Hero) -> Unit
) : RecyclerView.Adapter<HeroesAdapter.HeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroViewHolder {
        val view = View.inflate(parent.context, R.layout.item_hero, null)
        return HeroViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroes.size
    }

    override fun onBindViewHolder(holder: HeroViewHolder, position: Int) {
        val hero = heroes[position]
        holder.bind(hero)
    }


    inner class HeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val ivHero: ImageView = view.findViewById(R.id.heroImage)
        private val tvHeroName: TextView = view.findViewById(R.id.heroName)
        private val tvHeroRealName: TextView = view.findViewById(R.id.heroRealName)
        private val tvCreatedBy: TextView = view.findViewById(R.id.heroCreatedBy)

        fun bind(hero: Hero) {
            Glide.with(ivHero).load(hero.imageUrl).into(ivHero)
            tvHeroName.text = hero.name
            tvHeroRealName.text = hero.realName
            tvCreatedBy.text = hero.createdBy
            itemView.setOnClickListener {
                onItemClick(hero)
            }
        }
    }
}