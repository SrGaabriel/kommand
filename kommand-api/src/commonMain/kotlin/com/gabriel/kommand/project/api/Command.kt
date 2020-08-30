package com.gabriel.kommand.project.api

class Command(
    val names: List<String>,
    val fragments: Map<List<String>, CommandFragment>
)