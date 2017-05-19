package io.playcode.anpoz.kotlindemo.data.source

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


/**
 * Created by anpoz on 2017/5/18.
 */
class RetrofitHelper private constructor() {
    val DEFAULT_TIMEOUT = 5L

    companion object {
        fun get(): RetrofitHelper {
            return Inner.instance
        }
    }

    private object Inner {
        val instance = RetrofitHelper()
    }

    fun <T> configRetrofit(service: Class<T>, baseUrl: String): T {
        val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(configClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        return retrofit.create(service)
    }

    private fun configClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
        return builder.build()
    }
}