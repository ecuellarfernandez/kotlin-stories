package com.example.practicarecyclerview.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practicarecyclerview.R
import com.example.practicarecyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.viewPager, DetailFragment.newInstance())
                .commitNow()
        }
    }
}