package com.example.practicarecyclerview.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.practicarecyclerview.ui.stories.StoriesActivity
import com.example.practicarecyclerview.ui.stories.StoriesFragment

class PagerAdapter(
    fragment: StoriesActivity,
    private val images: ArrayList<String>?
) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return images?.size ?: 0
    }

    override fun createFragment(position: Int): Fragment {
        //crea un fragment por cada imagen
        return StoriesFragment.newInstance(images!![position])
    }
}