package com.example.practicarecyclerview.ui.stories

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.practicarecyclerview.R
import com.example.practicarecyclerview.databinding.FragmentStoriesBinding

class StoriesFragment() : Fragment() {

    companion object {
        fun newInstance(imageUrl: String) = StoriesFragment().apply {
            arguments = Bundle().apply {
                putString("imageUrl", imageUrl)
            }
        }
    }

    private val viewModel: StoriesViewModel by viewModels()
    private lateinit var binding: FragmentStoriesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
): View {
    binding = FragmentStoriesBinding.inflate(inflater, container, false)

    // Recuperar la URL de la imagen de los argumentos del fragmento
    val imageUrl = arguments?.getString("imageUrl")

    // Usar Glide para cargar la imagen en un ImageView
    if (imageUrl != null) {
        Glide.with(this)
            .load(imageUrl)
            .placeholder(android.R.drawable.ic_menu_gallery)
            .into(binding.imageView)
    }

    return binding.root
}

}