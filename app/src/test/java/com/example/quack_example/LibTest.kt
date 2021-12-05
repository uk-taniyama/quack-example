package com.example.quack_example

import com.example.quack_example.lib.Lib
import org.junit.Assert.*
import org.junit.Test

class LibTest {
    @Test
    fun callJs() {
        val lib= Lib()
        val hello = lib.callJs("'HELLO'")
        assertEquals("HELLO", hello)
    }
}
