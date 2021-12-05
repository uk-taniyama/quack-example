package com.example.quack_example.lib

import com.koushikdutta.quack.QuackContext

class Lib {
    fun callJs(script: String): String {
        QuackContext.create().use { ctx ->
            return ctx.evaluate(script).toString()
        }
    }
}
