package com.gabriel.kommand.project.prototype

interface Sender<T> {

    suspend fun asUser(): T

}