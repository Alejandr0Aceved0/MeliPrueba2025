package com.ingeacev.meliprueba2025.data.remote.model

import com.google.gson.annotations.SerializedName
import com.ingeacev.meliprueba2025.Results


data class SearchResponse (

  @SerializedName("site_id"                   ) var siteId                 : String?                     = null,
  @SerializedName("country_default_time_zone" ) var countryDefaultTimeZone : String?                     = null,
  @SerializedName("query"                     ) var query                  : String?                     = null,
  @SerializedName("paging"                    ) var paging                 : Paging?                     = Paging(),
  @SerializedName("results"                   ) var results                : ArrayList<Results>          = arrayListOf(),
  @SerializedName("sort"                      ) var sort                   : Sort?                       = Sort(),
  @SerializedName("available_sorts"           ) var availableSorts         : ArrayList<AvailableSorts>   = arrayListOf(),
  @SerializedName("filters"                   ) var filters                : ArrayList<Filters>          = arrayListOf(),
  @SerializedName("available_filters"         ) var availableFilters       : ArrayList<AvailableFilters> = arrayListOf(),
  @SerializedName("currency"                  ) var currency               : Currency?                   = Currency(),
  @SerializedName("available_currencies"      ) var availableCurrencies    : AvailableCurrencies?        = AvailableCurrencies(),
  @SerializedName("pdp_tracking"              ) var pdpTracking            : PdpTracking?                = PdpTracking(),
  @SerializedName("user_context"              ) var userContext            : String?                     = null

)