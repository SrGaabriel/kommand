package com.gabriel.kommand.project.builder

import com.gabriel.kommand.project.api.Command
import com.gabriel.kommand.project.api.CommandFragment
import com.gabriel.kommand.project.context.CommandContext

class CommandBuilder(private val labels: List<String>) {

    private val fragments: MutableMap<List<String>, CommandFragment> = mutableMapOf()

    private var descriptionCallback: () -> String = { "No description provided." }
    private var examplesCallback: () -> List<String> = { emptyList() }

    @Suppress("unchecked_cast")
    fun <T : CommandContext<*>> fragment(vararg labels: String, callback: suspend T.() -> Unit) {
        fragments[labels.toList()] = CommandFragment(labels.toList(), callback as CommandContext<*>.() -> Unit)
    }

    fun description(callback: () -> String) {
        descriptionCallback = callback
    }

    fun examples(callback: () -> List<String>) {
        examplesCallback = callback
    }

    fun build(): Command = Command(
        labels,
        fragments
    )

}