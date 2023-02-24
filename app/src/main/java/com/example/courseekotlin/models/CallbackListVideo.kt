package com.example.courseekotlin.models

data class CallbackListVideo(
    var status: String = "",
    var count: Int = -1,
    var count_total: Int = -1,
    var pages: Int = -1,
    var posts: List<Video> = ArrayList()
)
