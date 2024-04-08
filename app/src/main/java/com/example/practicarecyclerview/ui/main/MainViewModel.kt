package com.example.practicarecyclerview.ui.main

import androidx.lifecycle.ViewModel
import com.example.practicarecyclerview.models.Person

class MainViewModel : ViewModel() {
    val persons = mutableListOf(
        Person(
            1, "Haniel", "https://i.ytimg.com/vi/aOI07j-YvV8/maxresdefault.jpg", mutableListOf(
                "https://phantom-marca.unidadeditorial.es/d854ede20ce4e34c274c0ca965bf4dc9/resize/828/f/jpg/assets/multimedia/imagenes/2023/11/28/17012041377341.jpg",
                "https://www.fidalga.com/cdn/shop/products/1220001.jpg?v=1653343944"
            )
        ),
        Person(
            2,
            "Cheky",
            "https://i0.wp.com/codigoespagueti.com/wp-content/uploads/2023/09/hora-de-aventura-fionna-and-cake-finn-adulto.jpg",
            mutableListOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTdukxPSUo13vjSCWc9QxcYaxxft3qflMwyPF0h-lHDg&s",
                "https://www.cronica.com.ar/__export/1628282194594/sites/cronica/img/2021/08/06/maxi_2_crop1628279776764.jpg_315917931.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNvZLyIPPkvGRWMXSHVrGJAEbz0nKFhFDcZ9YYGaKjrg&s",
                "https://px.fotos.cdn.0223.com.ar/f/112022/1667912586794.jpg",
            )
        ),
        Person(
            3,
            "Supayave",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYZC99gyoILL7U_tIpe1Ffk8VJklNkUtl02b3zsXvJbQ&s",
            mutableListOf(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8s6s8CeTpgo6aVn9Z3DbbxfTSjjyf1_VvLZTIvLTILA&s",
            )
        ),
        Person(
            4,
            "Soto",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8oHo0FancjuAcw9EpO2of7trNHRh5vp92PyMk_XqxFw&s"
        ),
        Person(
            5,
            "Luis",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQa611nAD8Kw03zQ6eVwrvmiraOb_DF8r57xiHOB1WTg&s"
        ),
        Person(6, "ingenieroJM", "https://www.w3schools.com/howto/img_avatar.png"),
        Person(7, "user7", "https://i.imgur.com/4rlH1CZ.jpeg"),
        Person(8, "user8", "https://i.imgur.com/QWwbGsu.jpeg"),
        Person(9, "user9", "https://i.imgur.com/O17agpD.jpeg"),
        Person(10, "user10", "ic_launcher_background"),
    )

}