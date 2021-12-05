package com.example.quack_example.cli

import com.example.quack_example.lib.Lib
import org.junit.Assert.*
import org.junit.Test

class LibTest {
    @Test
    fun callJsFromCli() {
        val lib= Lib()
        val hello = lib.callJs("'HELLO'")
        assertEquals("HELLO", hello)
    }
}
