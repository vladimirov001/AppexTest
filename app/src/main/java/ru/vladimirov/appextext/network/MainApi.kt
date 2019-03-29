package ru.vladimirov.appextext.network

import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST
import ru.vladimirov.appextext.models.DeviceInfo
import ru.vladimirov.appextext.models.Message

interface MainApi {

    @POST("test")
    fun updateUser(@Body params: DeviceInfo): Observable<Message>

}