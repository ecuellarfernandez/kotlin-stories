package com.example.practicarecyclerview.models

class Person (
    var id: Int = 0,
    var name: String = "",
    var avatarImg: String = "",
    var storiesImg: MutableList<String> = mutableListOf()
)