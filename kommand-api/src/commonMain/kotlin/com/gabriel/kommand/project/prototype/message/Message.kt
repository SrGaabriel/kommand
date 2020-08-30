package com.gabriel.kommand.project.prototype.message

import com.gabriel.kommand.project.prototype.Sender

interface Message {

    val idLong: Long
    val author: Sender<*>
    val content: String

}