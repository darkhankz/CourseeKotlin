package com.example.courseekotlin.data.repository

import com.example.courseekotlin.models.CallbackCategories
import com.example.courseekotlin.models.CallbackListVideo
import retrofit2.Call

interface VideoDBRepository {
    fun getVideo(
        page: Int,
        count: Int,
        sort: String,
        apiKey: String
    ): Call<CallbackListVideo>

    fun getAllCategories(
        apiKey: String
    ): Call<CallbackCategories>
}