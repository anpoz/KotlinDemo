package io.playcode.anpoz.kotlindemo.data.source

import io.playcode.anpoz.kotlindemo.data.model.PandaStreamEntity
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by anpoz on 2017/5/18.
 */
interface PandaAPI {
    //http://api.m.panda.tv/ajax_get_liveroom_baseinfo?roomid=769965&slaveflag=1&type=json&__version=3.0.6.3203&__plat=android&__channel=wandoujia
    @GET("ajax_get_liveroom_baseinfo?slaveflag=1&type=json&__version=3.0.6.3203&__plat=android&__channel=wandoujia")
    fun getPandaStreamInfo(@Query("roomid") roomid: String): Observable<PandaStreamEntity>
}

