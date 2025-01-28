package com.ingeacev.meliprueba2025.data.remote.model

import com.google.gson.annotations.SerializedName


data class Conditions (

  @SerializedName("eligible"             ) var eligible            : Boolean?          = null,
  @SerializedName("context_restrictions" ) var contextRestrictions : ArrayList<String> = arrayListOf(),
  @SerializedName("start_time"           ) var startTime           : String?           = null,
  @SerializedName("end_time"             ) var endTime             : String?           = null

)