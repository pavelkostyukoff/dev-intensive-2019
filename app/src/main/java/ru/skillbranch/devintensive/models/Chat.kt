package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*
import kotlin.math.abs


class Chat(
    val id:String,
    val members: MutableList<User> = mutableListOf(),
    val messages:MutableList<BaseMessage> = mutableListOf()
) {

}