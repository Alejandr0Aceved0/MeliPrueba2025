package com.ingeacev.meliprueba2025.data.remote.model

import com.google.gson.annotations.SerializedName


data class Sort(

    @SerializedName("id") var id: String? = null,
    @SerializedName("name") var name: String? = null

)