package com.gabriel.kommand.project.context

import com.gabriel.kommand.project.client.DiscordClient
import com.gabriel.kommand.project.event.AbstractEvent
import com.gabriel.kommand.project.prototype.Host

class JDACommandDispatcher: CommandHandler<DiscordClient> {


    override fun listen(client: DiscordClient) {

    }

    override fun <T> define(prefix: String, host: Host<T>) {
        TODO("Not yet implemented")
    }

    override fun <T> dispatch(context: CommandContext<T>) {
        TODO("Not yet implemented")
    }
}
