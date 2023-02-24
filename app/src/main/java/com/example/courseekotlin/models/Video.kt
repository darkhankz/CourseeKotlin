package com.example.courseekotlin.models

import java.io.Serializable

data class Video(
    var id: Int = 0,
    var cat_id: String = "",
    var category_name: String = "",
    var vid: String = "",
    var video_title: String = "",
    var video_url: String = "",
    var video_id: String = "",
    var video_thumbnail: String = "",
    var video_duration: String = "",
    var video_description: String = "",
    var video_type: String = "",
    var size: String = "",
    var total_views: Long = 0,
    var date_time: String = ""
): Serializable



