package com.ingeacev.meliprueba2025.data.remote.model

import com.google.gson.annotations.SerializedName


data class Location(

    @SerializedName("address_line") var addressLine: String? = null,
    @SerializedName("zip_code") var zipCode: String? = null,
    @SerializedName("subneighborhood") var subneighborhood: String? = null,
    @SerializedName("neighborhood") var neighborhood: Neighborhood? = Neighborhood(),
    @SerializedName("city") var city: City? = City(),
    @SerializedName("state") var state: State? = State(),
    @SerializedName("country") var country: Country? = Country(),
    @SerializedName("latitude") var latitude: Double? = null,
    @SerializedName("longitude") var longitude: Double? = null

)