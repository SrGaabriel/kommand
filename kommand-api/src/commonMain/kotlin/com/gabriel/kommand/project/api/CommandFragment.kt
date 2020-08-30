package com.gabriel.kommand.project.api

import com.gabriel.kommand.project.context.CommandContext

class CommandFragment(
    val labels: List<String>,
    val callback: T.() -> Unit
)