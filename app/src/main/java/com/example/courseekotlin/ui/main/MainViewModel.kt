package com.example.courseekotlin.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.courseekotlin.data.repository.VideoDBRepository
import com.example.courseekotlin.data.repository.VideoDBRepositoryImpl
import com.example.courseekotlin.models.CallbackCategories
import com.example.courseekotlin.models.CallbackListVideo
import com.example.courseekotlin.models.Video
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel {
    private val mVideoRepository : VideoDBRepository = VideoDBRepositoryImpl()

    private val _videos = MutableLiveData<List<Video>>()
    val videos : LiveData<List<Video>> = _videos

    fun getVideo() {
        val response = mVideoRepository.getVideo(1, 20, "n.total_views DESC", "cda119TEK3Ar5FS6gRwqVWnN7YLpb0u4v1jfkJOaQxX8UDsBcI")
        response.enqueue(object : Callback<CallbackListVideo>{
            override fun onResponse(
                call: Call<CallbackListVideo>,
                response: Response<CallbackListVideo>
            ) {
                _videos.postValue(response.body()?.posts ?: emptyList())
                Log.d("VideoAdapter", "Videos: ${response.body()?.posts ?: emptyList()}")

            }

            override fun onFailure(call: Call<CallbackListVideo>, t: Throwable) {
                Log.d("VideoAdapter", "error")
            }

        })
    }

    fun getCategories(){
        val response = mVideoRepository.getAllCategories("cda119TEK3Ar5FS6gRwqVWnN7YLpb0u4v1jfkJOaQxX8UDsBcI")
        response.enqueue(object : Callback<CallbackCategories>{
            override fun onResponse(
                call: Call<CallbackCategories>,
                response: Response<CallbackCategories>
            ) {
                val result = response.body()?.toString()
                Log.d("VideoAdapter", "category result: $result")
            }

            override fun onFailure(call: Call<CallbackCategories>, t: Throwable) {
                Log.e("VideoAdapter", "category error")

            }

        })
    }
}