package com.example.practicarecyclerview.ui.main

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practicarecyclerview.R
import com.example.practicarecyclerview.databinding.ActivityMainBinding
import com.example.practicarecyclerview.ui.adapters.PersonAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val model: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        // creamos un adapter para el recycler view y le pasamos la lista de personas
        val adapter = PersonAdapter(model.persons)
        binding.lstPeople.adapter = adapter
        binding.lstPeople.layoutManager = LinearLayoutManager(this).apply { orientation = LinearLayoutManager.HORIZONTAL}
    }

}