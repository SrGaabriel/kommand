package com.gabriel.kommand.project.prototype.channel

interface Channel {

    val name: String

    fun message(content: String)

}