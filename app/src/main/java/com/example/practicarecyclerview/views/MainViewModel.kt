package com.example.practicarecyclerview.views

import androidx.lifecycle.ViewModel
import com.example.practicarecyclerview.models.Person

class MainViewModel: ViewModel() {
    val persons = mutableListOf(
        Person(1, "Haniel", "https://i.ytimg.com/vi/aOI07j-YvV8/maxresdefault.jpg"),
        Person(2, "Cheky", "https://i0.wp.com/codigoespagueti.com/wp-content/uploads/2023/09/hora-de-aventura-fionna-and-cake-finn-adulto.jpg"),
        Person(3, "Supayave", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYZC99gyoILL7U_tIpe1Ffk8VJklNkUtl02b3zsXvJbQ&s"),
        Person(4, "Soto", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8oHo0FancjuAcw9EpO2of7trNHRh5vp92PyMk_XqxFw&s"),
        Person(5, "Luis", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQa611nAD8Kw03zQ6eVwrvmiraOb_DF8r57xiHOB1WTg&s"),
        Person(6, "ingenieroJM", "https://www.w3schools.com/howto/img_avatar.png"),
        Person(7, "user7", "https://i.imgur.com/4rlH1CZ.jpeg"),
        Person(8, "user8", "https://i.imgur.com/QWwbGsu.jpeg"),
        Person(9, "user9", "https://i.imgur.com/O17agpD.jpeg"),
        Person(10, "user10", "ic_launcher_background"),
    )

    fun getPerson(id: Int): Person?{
        return persons.find { it.id == id }
    }

}