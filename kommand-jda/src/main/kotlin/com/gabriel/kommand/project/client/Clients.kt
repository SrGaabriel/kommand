package com.gabriel.kommand.project.client

import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.sharding.ShardManager

class DiscordClient(override val id: Int): Client

fun Client.asJDA(manager: ShardManager): JDA? =
    manager.getShardById(this.id)
