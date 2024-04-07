package com.example.practicarecyclerview.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.example.practicarecyclerview.databinding.PersonListItemBinding
import com.example.practicarecyclerview.models.Person
import java.io.File

class PersonAdapter (
    private val persons: List<Person>
    ): RecyclerView.Adapter<PersonAdapter.PersonViewHolder>(){

class PersonViewHolder(private val binding: PersonListItemBinding): RecyclerView.ViewHolder(binding.root){
    // esta funcion se encarga de bindear los datos de la persona a la vista
    @SuppressLint("DiscouragedApi")
    fun bind(person: Person){
            val binding = PersonListItemBinding.bind(itemView)
            binding.lblPersonName.text = person.name
            // cargamos la imagen de la persona

            val imageSource : Any = if(person.avatarImg.startsWith("http")){
                person.avatarImg
            } else{
                itemView.context.resources.getIdentifier(person.avatarImg, "drawable", itemView.context.packageName)
            }

            Glide.with(itemView.context)
                .load(imageSource)
                .transform(CircleCrop())
                .placeholder(android.R.drawable.ic_menu_gallery)
                .into(binding.imgPersonAvatar)
        }
    }

    // esta funcion se encarga de crear la vista de la persona
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonAdapter.PersonViewHolder {
        val binding = PersonListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PersonViewHolder(binding)
    }

    // esta funcion se encarga de retornar la cantidad de personas
    override fun getItemCount(): Int {
        return persons.size
    }

    // esta funcion se encarga de bindear los datos de la persona a la vista
    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.bind(persons[position])
    }

}