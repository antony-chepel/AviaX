package com.perfect.eleven.football.manager.to.ygdg

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface Jnxihsazax {
    @GET("const.json")
    suspend fun bhjcxoo(): Response<Bgysujcixzjc>
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun ysuiax(): Response<Ujkksxcnzjsa>


}

@Keep
data class Ujkksxcnzjsa(
    @SerializedName("city")
    val siisx: String,
    @SerializedName("country")
    val aposlc: String,
    @SerializedName("countryCode")
    val usiosod: String,
)
@Keep
data class Bgysujcixzjc(
    @SerializedName("geo")
    val vjcx: String,
    @SerializedName("view")
    val opsdso: String,
    @SerializedName("appsChecker")
    val ftysuud: String,
)
