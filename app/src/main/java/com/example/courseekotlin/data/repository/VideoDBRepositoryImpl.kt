package com.example.courseekotlin.data.repository

import com.example.courseekotlin.data.api.ApiInterface
import com.example.courseekotlin.models.CallbackCategories
import com.example.courseekotlin.models.CallbackListVideo
import retrofit2.Call

class VideoDBRepositoryImpl: VideoDBRepository {
    private val apiInterface = ApiInterface.create()

    override fun getVideo(page: Int, count: Int, sort: String, apiKey: String): Call<CallbackListVideo> {
        return apiInterface.getVideos(page = page, count = count, sort = sort, api_key = apiKey)
    }

    override fun getAllCategories(apiKey: String): Call<CallbackCategories> {
        return apiInterface.getAllCategories(api_key = apiKey)
    }

}