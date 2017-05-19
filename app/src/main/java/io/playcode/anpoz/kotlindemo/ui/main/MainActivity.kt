package io.playcode.anpoz.kotlindemo.ui.main

import android.content.pm.ActivityInfo
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import com.shuyu.gsyvideoplayer.GSYVideoPlayer
import com.shuyu.gsyvideoplayer.utils.OrientationUtils
import io.playcode.anpoz.kotlindemo.R
import io.playcode.anpoz.kotlindemo.ui.main.MainContract.Presenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : android.support.v7.app.AppCompatActivity(), MainContract.View {
    lateinit private var presenter: Presenter
    lateinit var orientationUtils: OrientationUtils

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainPresenter(this)
        presenter.subscribe()
        orientationUtils = OrientationUtils(this, player)
        button.setOnClickListener {
            if (!TextUtils.isEmpty(editText.text))
                presenter.setRoomId(editText.text.toString())
        }
        player.backButton.visibility = View.INVISIBLE
        player.fullscreenButton.setOnClickListener {
            orientationUtils.resolveByClick()
            player.startWindowFullscreen(this, true, true)
        }
        player.setIsTouchWiget(true)
        player.backButton.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onPause() {
        super.onPause()
        player.onVideoPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unSubscribe()
        orientationUtils.releaseListener()
    }

    override fun onBackPressed() {
        if (orientationUtils.screenType == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
            player.fullscreenButton.performClick()
            return
        }
        player.setStandardVideoAllCallBack(null)
        GSYVideoPlayer.releaseAllVideos()
        super.onBackPressed()
    }

    override fun setVideoTitle(title: String) {
        player.titleTextView.text = title
    }

    override fun setVideoPath(path: String) {
        try {
            player.setUp(path, false, "")
            player.startPlayLogic()
        } catch (e: Exception) {
            Toast.makeText(this, "暂未开播或线路不佳", Toast.LENGTH_SHORT).show()
        }
    }
}
