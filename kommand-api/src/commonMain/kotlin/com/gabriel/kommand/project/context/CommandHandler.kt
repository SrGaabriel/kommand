package com.gabriel.kommand.project.context

import com.gabriel.kommand.project.client.Client
import com.gabriel.kommand.project.prototype.Host

interface CommandHandler<T : Client> {

    fun listen(client: T)

    fun <T> define(prefix: String, host: Host<T>)

    fun <T> dispatch(context: CommandContext<T>)

}