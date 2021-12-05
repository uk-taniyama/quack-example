package com.example.quack_example

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.quack_example.lib.Lib
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LibAndroidTest {
    @Test
    fun callJsFromAndroid() {
        val lib= Lib()
        val hello = lib.callJs("'HELLO'")
        assertEquals("HELLO", hello)
    }
}
