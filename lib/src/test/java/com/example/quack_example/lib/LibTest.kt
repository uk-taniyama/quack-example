package com.example.quack_example.lib

import org.junit.Assert.assertEquals
import org.junit.Test

class LibTest {
    @Test
    fun callJs() {
        val lib = Lib()
        val hello = lib.callJs("'HELLO'")
        assertEquals("HELLO", hello)
    }
}