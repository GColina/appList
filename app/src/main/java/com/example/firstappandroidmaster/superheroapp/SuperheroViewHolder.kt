package com.example.firstappandroidmaster.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.firstappandroidmaster.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperheroViewHolder (view:View):RecyclerView.ViewHolder(view){

    private val binding = ItemSuperheroBinding.bind(view)

    fun bind(SuperHeroItemResponse:SuperHeroItemResponse, onItemSelected: (String) -> Unit){
        binding.tvSuperHeroName.text = SuperHeroItemResponse.name
        Picasso.get().load(SuperHeroItemResponse.superHeroImage.url).into(binding.ivSuperHero)
        binding.root.setOnClickListener { onItemSelected(SuperHeroItemResponse.superheroId) }
    }
}