package io.playcode.anpoz.kotlindemo.ui.main

import io.playcode.anpoz.kotlindemo.ui.base.BasePresenter
import io.playcode.anpoz.kotlindemo.ui.base.BaseView

/**
 * Created by anpoz on 2017/5/18.
 */
interface MainContract {
    interface Presenter : BasePresenter {
        fun setRoomId(id: String)
    }

    interface View : BaseView {
        fun setVideoPath(path: String)
        fun setVideoTitle(title: String)
    }
}