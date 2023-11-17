package com.example.practica3.model

import androidx.annotation.DrawableRes

data class Message(val authorName:String,@DrawableRes val imgAuthor:Int, val text:String)