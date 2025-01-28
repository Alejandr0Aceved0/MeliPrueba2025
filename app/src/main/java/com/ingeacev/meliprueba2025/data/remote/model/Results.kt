package com.ingeacev.meliprueba2025

import com.google.gson.annotations.SerializedName
import com.ingeacev.meliprueba2025.data.remote.model.Address
import com.ingeacev.meliprueba2025.data.remote.model.Attributes
import com.ingeacev.meliprueba2025.data.remote.model.Location
import com.ingeacev.meliprueba2025.data.remote.model.SalePrice
import com.ingeacev.meliprueba2025.data.remote.model.Seller
import com.ingeacev.meliprueba2025.data.remote.model.SellerContact
import com.ingeacev.meliprueba2025.data.remote.model.Shipping


data class Results (

    @SerializedName("id"                    ) var id                   : String?               = null,
    @SerializedName("title"                 ) var title                : String?               = null,
    @SerializedName("condition"             ) var condition            : String?               = null,
    @SerializedName("thumbnail_id"          ) var thumbnailId          : String?               = null,
    @SerializedName("catalog_product_id"    ) var catalogProductId     : String?               = null,
    @SerializedName("listing_type_id"       ) var listingTypeId        : String?               = null,
    @SerializedName("sanitized_title"       ) var sanitizedTitle       : String?               = null,
    @SerializedName("permalink"             ) var permalink            : String?               = null,
    @SerializedName("buying_mode"           ) var buyingMode           : String?               = null,
    @SerializedName("site_id"               ) var siteId               : String?               = null,
    @SerializedName("category_id"           ) var categoryId           : String?               = null,
    @SerializedName("domain_id"             ) var domainId             : String?               = null,
    @SerializedName("thumbnail"             ) var thumbnail            : String?               = null,
    @SerializedName("currency_id"           ) var currencyId           : String?               = null,
    @SerializedName("order_backend"         ) var orderBackend         : Int?                  = null,
    @SerializedName("price"                 ) var price                : Int?                  = null,
    @SerializedName("original_price"        ) var originalPrice        : String?               = null,
    @SerializedName("sale_price"            ) var salePrice            : SalePrice?            = SalePrice(),
    @SerializedName("available_quantity"    ) var availableQuantity    : Int?                  = null,
    @SerializedName("official_store_id"     ) var officialStoreId      : Int?                  = null,
    @SerializedName("official_store_name"   ) var officialStoreName    : String?               = null,
    @SerializedName("use_thumbnail_id"      ) var useThumbnailId       : Boolean?              = null,
    @SerializedName("accepts_mercadopago"   ) var acceptsMercadopago   : Boolean?              = null,
    @SerializedName("shipping"              ) var shipping             : Shipping?             = Shipping(),
    @SerializedName("stop_time"             ) var stopTime             : String?               = null,
    @SerializedName("seller"                ) var seller               : Seller?               = Seller(),
    @SerializedName("address"               ) var address              : Address?              = Address(),
    @SerializedName("attributes"            ) var attributes           : ArrayList<Attributes> = arrayListOf(),
    @SerializedName("location"              ) var location             : Location?             = Location(),
    @SerializedName("seller_contact"        ) var sellerContact        : SellerContact?        = SellerContact(),
    @SerializedName("installments"          ) var installments         : String?               = null,
    @SerializedName("winner_item_id"        ) var winnerItemId         : String?               = null,
    @SerializedName("catalog_listing"       ) var catalogListing       : Boolean?              = null,
    @SerializedName("discounts"             ) var discounts            : String?               = null,
    @SerializedName("promotion_decorations" ) var promotionDecorations : String?               = null,
    @SerializedName("promotions"            ) var promotions           : String?               = null,
    @SerializedName("inventory_id"          ) var inventoryId          : String?               = null

)