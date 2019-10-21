package com.example.recynestedgroupdate

import br.com.mirabilis.tanpa_key.model.mRespon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("menu_list.php")
    fun getMenu() : Call<String>

}