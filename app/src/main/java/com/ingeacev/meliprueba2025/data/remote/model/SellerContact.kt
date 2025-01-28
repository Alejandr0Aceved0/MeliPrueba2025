package com.ingeacev.meliprueba2025.data.remote.model

import com.google.gson.annotations.SerializedName


data class SellerContact (

  @SerializedName("contact"    ) var contact   : String? = null,
  @SerializedName("other_info" ) var otherInfo : String? = null,
  @SerializedName("webpage"    ) var webpage   : String? = null,
  @SerializedName("area_code"  ) var areaCode  : String? = null,
  @SerializedName("phone"      ) var phone     : String? = null,
  @SerializedName("area_code2" ) var areaCode2 : String? = null,
  @SerializedName("phone2"     ) var phone2    : String? = null,
  @SerializedName("email"      ) var email     : String? = null

)