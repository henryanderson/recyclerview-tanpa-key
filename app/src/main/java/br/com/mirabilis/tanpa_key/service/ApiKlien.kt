package com.example.recynestedgroupdate

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class ApiKlien {
    companion object {
        //GsonConverterFactory.create()
        //ScalarsConverterFactory.create()
        fun ambilKlien() : Retrofit {
            val BASE_URL = "http://192.168.43.121/laravelandroid/"
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build()

            return retrofit
        }
    }
}