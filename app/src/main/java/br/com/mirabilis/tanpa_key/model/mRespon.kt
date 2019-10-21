package br.com.mirabilis.tanpa_key.model

data class mRespon (
    val status : String,
    val menu : String
)

data class mTop(val kategori : String, val sub : ArrayList<mSub>)

data class mSub(val id_menu : String, val nama_menu : String)