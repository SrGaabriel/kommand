package com.gabriel.kommand.project.event

import com.gabriel.kommand.project.api.Command
import com.gabriel.kommand.project.context.CommandHolder
import org.koin.core.KoinComponent
import org.koin.core.get

class CommandAccessEvent(
    val label: String,
    val command: Command?
): AbstractEvent(), KoinComponent {

    suspend fun isValidAttempt(): Boolean = TODO("TODO")


}