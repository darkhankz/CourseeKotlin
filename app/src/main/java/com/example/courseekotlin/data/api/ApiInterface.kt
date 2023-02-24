package com.example.courseekotlin.data.api

import com.example.courseekotlin.models.CallbackCategories
import com.example.courseekotlin.models.CallbackListVideo
import com.example.courseekotlin.utils.Constance.Companion.ADMIN_PANEL_URL
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {
    companion object {
        const val CACHE = "Cache-Control: max-age=0"
        const val AGENT = "Data-Agent: Your Videos Channel"

        fun create(): ApiInterface {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(ADMIN_PANEL_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)
        }
    }

    @Headers(CACHE, AGENT)
    @GET("api/get_videos")
    fun getVideos(
        @Query("page") page: Int,
        @Query("count") count: Int,
        @Query("sort") sort: String,
        @Query("api_key") api_key: String
    ): Call<CallbackListVideo>

    @Headers(CACHE, AGENT)
    @GET("api/get_category_index")
    fun getAllCategories(
        @Query("api_key") api_key: String
    ): Call<CallbackCategories>

}