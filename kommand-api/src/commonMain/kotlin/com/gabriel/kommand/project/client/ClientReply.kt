package com.gabriel.kommand.project.client

import com.gabriel.kommand.project.reply.ReplyAware

abstract class ClientReply<T>(
    val prefix: String,
    val content: String,
    val target: ReplyAware
) {

    abstract suspend fun build(): T

}