package com.example.unresolvedreferencebug

import kotlinx.coroutines.flow.Flow.asFlow

class Greeting {
    fun greeting(): String {
        (1..9).asFlow()
        return "Hello, ${Platform().platform}!"
    }
}