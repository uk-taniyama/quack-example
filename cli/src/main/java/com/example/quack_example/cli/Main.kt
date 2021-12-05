package com.example.quack_example.cli

import com.example.quack_example.lib.Lib

fun main(args: Array<String>) {
    val lib = Lib()
    val hello = lib.callJs("'HELLO'")
    println(hello)
}
