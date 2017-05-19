package io.playcode.anpoz.kotlindemo.data.source

import io.playcode.anpoz.kotlindemo.data.model.PandaStreamEntity
import io.reactivex.Observable

/**
 * Created by anpoz on 2017/5/18.
 */
class AppRepository private constructor() {
    val BASE_URL = "http://api.m.panda.tv/"

    companion object {
        fun get(): AppRepository {
            return Inner.instance
        }
    }

    private object Inner {
        val instance = AppRepository()
    }

    fun getStreamInfo(id: String): Observable<PandaStreamEntity> {
        return RetrofitHelper.get()
                .configRetrofit(PandaAPI::class.java, BASE_URL)
                .getPandaStreamInfo(id)
    }
}