package com.example.practicarecyclerview.ui.stories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import com.example.practicarecyclerview.R
import com.example.practicarecyclerview.databinding.ActivityStoriesBinding
import com.example.practicarecyclerview.ui.adapters.PagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class StoriesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStoriesBinding
    private val model: StoriesViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStoriesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViewPager()
    }

    private fun setupViewPager() {
        val imagenes = intent.getStringArrayListExtra("stories")
        Log.d("StoriesActivity", "setupViewPager: $imagenes")
        val adapter = PagerAdapter(this, imagenes)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.icon = ContextCompat.getDrawable(this, R.drawable.tab_indicator_default)
        }.attach()
    }
}