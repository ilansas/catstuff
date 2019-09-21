package com.sas.cat_stuff.network

import com.sas.data.model.AddFavorite
import com.sas.data.retrofit.CatApi

object Requester {

    suspend fun fetch() = CatApi.api.getBreeds(0)

    suspend fun getImages() = CatApi.api.getImages()

    suspend fun addImageToFavorite(id: String) = CatApi.api.addImageToFavorite(AddFavorite(id))
}