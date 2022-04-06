package com.example.unresolvedreferencebug

import kotlinx.coroutines.flow.asFlow

class Greeting {
    fun greeting(): String {
        (1..9).asFlow()
        return "Hello, ${Platform().platform}!"
    }
}