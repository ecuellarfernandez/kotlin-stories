package com.example.practicarecyclerview.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.practicarecyclerview.ui.stories.StoriesFragment

class PageAdapter(fragment: Fragment, private val storiesList: List<String>) : FragmentStateAdapter(fragment) {
    class Pager():
    override fun getItemCount(): Int = storiesList.size
    override fun createFragment(position: Int): Fragment = StoriesFragment(storiesList[position])
}