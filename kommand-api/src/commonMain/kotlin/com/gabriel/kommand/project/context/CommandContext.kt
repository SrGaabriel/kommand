package com.gabriel.kommand.project.context

import com.gabriel.kommand.project.api.Command
import com.gabriel.kommand.project.api.CommandFragment
import com.gabriel.kommand.project.prototype.Host
import com.gabriel.kommand.project.prototype.Sender

interface CommandContext<T> {

    val label: String
    val sender: Sender<*>
    val host: Host<*>
    val command: Command
    val fragment: CommandFragment
    val message: T
    val args: List<String>

}