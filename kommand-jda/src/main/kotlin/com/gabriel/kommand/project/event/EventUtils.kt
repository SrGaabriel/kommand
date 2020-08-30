package com.gabriel.kommand.project.event

import com.gabriel.kommand.project.KommandJDA
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*


@FlowPreview
@ExperimentalCoroutinesApi
inline fun <reified T: AbstractEvent> KommandJDA.on(
    scope: CoroutineScope = this,
    noinline callback: suspend T.() -> Unit
) = eventFlow.buffer(Channel.UNLIMITED).filterIsInstance<T>().onEach { runCatching {
    callback(it)
}}.launchIn(this)