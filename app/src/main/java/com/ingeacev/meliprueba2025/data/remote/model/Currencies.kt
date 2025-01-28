package com.ingeacev.meliprueba2025.data.remote.model

import com.google.gson.annotations.SerializedName


data class Currencies(

    @SerializedName("id") var id: String? = null,
    @SerializedName("symbol") var symbol: String? = null

)