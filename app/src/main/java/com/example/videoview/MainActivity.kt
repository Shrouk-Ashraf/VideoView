package com.example.videoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView : VideoView = findViewById(R.id.testVideo)
        val mediaController = MediaController(this)
        val uri : Uri = Uri.parse("android.resource://com.example.videoview/raw/highway")

        //set media controller
        mediaController.setAnchorView(videoView)
        //set video view
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}