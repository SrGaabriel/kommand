package com.gabriel.kommand.project.context

import com.gabriel.kommand.project.api.Command
import com.gabriel.kommand.project.api.CommandFragment
import com.gabriel.kommand.project.prototype.Host
import com.gabriel.kommand.project.prototype.Sender
import net.dv8tion.jda.api.entities.Message

class JDACommandContext(
    override val label: String,
    override val sender: Sender<*>,
    override val host: Host<*>,
    override val command: Command,
    override val fragment: CommandFragment,
    override val message: Message,
    override val args: List<String>
) : CommandContext<Message> {



}