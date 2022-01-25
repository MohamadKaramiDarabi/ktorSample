package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "188.121.122.106") {
        configureRouting()
    }.start(wait = true)
}
