package com.ingeacev.meliprueba2025.di.model.converters

import android.annotation.SuppressLint
import android.net.Uri

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.reflect.ParameterizedType
import java.math.BigInteger
import java.time.LocalDate
import java.time.LocalDateTime
import androidx.room.TypeConverter
import java.time.LocalTime

class CacheConverters {

    private val type: ParameterizedType = Types.newParameterizedType(List::class.java, String::class.java)
    val adapter: JsonAdapter<List<String>> = Moshi.Builder().build().adapter(type)

    @TypeConverter
    fun stringToUri(value: String?): List<Uri>? {
        return if (value != null) adapter.fromJson(value)?.map { Uri.parse(it) } else null
    }

    @TypeConverter
    fun uriToString(uriList: List<Uri>?): String? {
        return adapter.toJson(uriList?.let { it.map { value -> value.toString() } })
    }

    @TypeConverter
    fun stringToList(value: String?): List<String>? {
        return if (value != null) adapter.fromJson(value) else null
    }

    @TypeConverter
    fun listToString(list: List<String>?): String? {
        return adapter.toJson(list)
    }

    @TypeConverter
    fun bigIntegerToString(value: BigInteger): String {
        return value.toString()
    }

    @TypeConverter
    fun stringToBigInteger(value: String): BigInteger {
        return BigInteger(value)
    }

    @TypeConverter
    fun localDateToString(value: LocalDate): String {
        return value.toString()
    }

    @SuppressLint("NewApi")
    @TypeConverter
    fun stringToLocalDate(value: String): LocalDate {
        return LocalDate.parse(value)
    }

    @TypeConverter
    fun localTimeToString(value: LocalTime): String {
        return value.toString()
    }

    @SuppressLint("NewApi")
    @TypeConverter
    fun stringToLocalTime(value: String): LocalTime {
        return LocalTime.parse(value)
    }

    @TypeConverter
    fun localDateTimeToString(value: LocalDateTime): String {
        return value.toString()
    }

    @SuppressLint("NewApi")
    @TypeConverter
    fun stringToLocalDateTime(value: String): LocalDateTime {
        return LocalDateTime.parse(value)
    }
}
