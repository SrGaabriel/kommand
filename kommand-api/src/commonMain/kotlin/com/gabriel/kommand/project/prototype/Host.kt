package com.gabriel.kommand.project.prototype

interface Host<T> {

    suspend fun asGuild(): T

}