package com.ingeacev.meliprueba2025.data.remote.model

import com.google.gson.annotations.SerializedName


data class SalePrice(

    @SerializedName("price_id") var priceId: String? = null,
    @SerializedName("amount") var amount: Int? = null,
    @SerializedName("conditions") var conditions: Conditions? = Conditions(),
    @SerializedName("currency_id") var currencyId: String? = null,
    @SerializedName("exchange_rate") var exchangeRate: String? = null,
    @SerializedName("payment_method_prices") var paymentMethodPrices: ArrayList<String> = arrayListOf(),
    @SerializedName("payment_method_type") var paymentMethodType: String? = null,
    @SerializedName("regular_amount") var regularAmount: String? = null,
    @SerializedName("type") var type: String? = null

)