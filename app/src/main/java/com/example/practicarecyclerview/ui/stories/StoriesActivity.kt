package com.example.practicarecyclerview.ui.stories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practicarecyclerview.ui.stories.ui.main.StoriesFragment

class StoriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stories)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, StoriesFragment.newInstance())
                .commitNow()
        }
    }
}