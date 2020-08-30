package com.gabriel.kommand.project.context

import com.gabriel.kommand.project.api.Command
import com.gabriel.kommand.project.api.CommandSnapshot

interface CommandHolder {

    val commands: Map<List<String>, Command>

    fun register(snapshot: CommandSnapshot)

}