package com.atvss.marvellist.api

import com.atvss.marvellist.data.Hero
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("marvel")
    fun getHeroes(): Call<List<Hero>>

}