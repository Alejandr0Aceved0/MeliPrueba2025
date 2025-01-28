package com.skgtecnologia.helios.comparendera.data.commons.model.converters

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import java.math.BigInteger
import java.time.LocalDateTime

class NetworkAdapters {

    @ToJson
    fun bigIntegerToJson(value: BigInteger) = value.toString()

    @FromJson
    fun bigIntegerFromJson(value: String) = BigInteger(value)

    @ToJson
    fun localDateTimeToJson(value: LocalDateTime) = value.toString()

    @FromJson
    fun localDateTimeFromJson(value: String): LocalDateTime = LocalDateTime.parse(value)
}
