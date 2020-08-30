package com.gabriel.kommand.project

import com.gabriel.kommand.project.event.AbstractEvent
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlin.coroutines.CoroutineContext

@FlowPreview
class KommandJDA @ExperimentalCoroutinesApi constructor(
    val eventChannel: BroadcastChannel<AbstractEvent> = BroadcastChannel(Channel.CONFLATED),
    val eventFlow: Flow<AbstractEvent> = eventChannel.asFlow()
): Kommand, CoroutineScope {

    override val coroutineContext: CoroutineContext = Dispatchers.Default
}