package com.example.letschat.model

//This is a structure that enables us to create multiple user's messages.

data class Messages(
    val userName:String,
    val time:String,
    val message:String
)
