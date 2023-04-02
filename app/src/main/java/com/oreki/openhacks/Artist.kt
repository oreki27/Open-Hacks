package com.oreki.openhacks

import android.media.Image

data class Artist(
    val id: String,
    val name:String,
    val link:String,
    val share:String,
    val picture:String,
    val picture_small:String,
    val picture_medium:String,
    val picture_big:String,
    val picture_xl:String,
    val nb_album:Int,
    val nb_fan:Long,
    val radio:Boolean,
    val tracklist:String,
    val type:String,
)
