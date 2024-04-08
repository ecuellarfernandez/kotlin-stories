package com.example.practicarecyclerview.ui.adapters

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.example.practicarecyclerview.databinding.PersonListItemBinding
import com.example.practicarecyclerview.models.Person
import com.example.practicarecyclerview.ui.stories.StoriesActivity
import java.io.File

class PersonAdapter(
    private val persons: List<Person>
) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    class PersonViewHolder(private val binding: PersonListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        // esta funcion se encarga de bindear los datos de la persona a la vista
        @SuppressLint("DiscouragedApi")
        fun bind(person: Person) {
            val binding = PersonListItemBinding.bind(itemView)
            binding.lblPersonName.text = person.name
            // cargamos la imagen de la persona

            val imageSource: Any = if (person.avatarImg.startsWith("http")) {
                person.avatarImg
            } else {
                itemView.context.resources.getIdentifier(
                    person.avatarImg,
                    "drawable",
                    itemView.context.packageName
                )
            }

            Glide.with(itemView.context)
                .load(imageSource)
                .transform(CircleCrop())
                .placeholder(android.R.drawable.ic_menu_gallery)
                .into(binding.imgPersonAvatar)

            itemView.setOnClickListener {
                //si no storiesImg no tiene contenido, no se envia la lista
                if (person.storiesImg.isEmpty()) {
                    //mostrar un toast
                    Toast.makeText(itemView.context, "${person.name} no tiene historias", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                val intent = Intent(itemView.context, StoriesActivity::class.java)
                intent.putExtra("stories", person.storiesImg as ArrayList<String>)
                itemView.context.startActivity(intent)
            }

        }
    }

    // esta funcion se encarga de crear la vista de la persona
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PersonAdapter.PersonViewHolder {
        val binding =
            PersonListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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
