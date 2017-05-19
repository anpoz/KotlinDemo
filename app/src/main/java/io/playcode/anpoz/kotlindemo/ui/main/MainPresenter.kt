package io.playcode.anpoz.kotlindemo.ui.main

import android.util.Log
import io.playcode.anpoz.kotlindemo.data.model.PandaStreamEntity
import io.playcode.anpoz.kotlindemo.data.source.AppRepository
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers


/**
 * Created by anpoz on 2017/5/18.
 */
class MainPresenter(var view: MainContract.View) : MainContract.Presenter {
    var compositeDisposable = CompositeDisposable()

    override fun subscribe() {
    }

    override fun unSubscribe() {
        compositeDisposable.clear()
    }

    override fun setRoomId(id: String) {
        AppRepository.get()
                .getStreamInfo(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<PandaStreamEntity> {
                    override fun onNext(t: PandaStreamEntity?) {
                        val cdn = t?.data?.info?.videoinfo?.plflag?.split("_")!![1]
                        val address = "http://pl" + cdn + ".live.panda.tv/live_panda/" +
                                t.data?.info?.videoinfo?.room_key + ".flv" +
                                "?sign=" + t.data?.info?.videoinfo?.sign +
                                "&time=" + t.data?.info?.videoinfo?.ts
                        Log.d(this.javaClass.name, address)
                        view.setVideoTitle(t.data?.info?.roominfo?.name!!)
                        view.setVideoPath(address)
                    }

                    override fun onSubscribe(d: Disposable?) {
                        compositeDisposable.add(d)
                    }

                    override fun onError(e: Throwable?) {
                        e?.printStackTrace()
                    }

                    override fun onComplete() {
                    }
                })
    }
}