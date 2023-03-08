package com.dehghan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayNameTest {

    private DisplayName displayName = new DisplayName();

    @org.junit.jupiter.api.DisplayName("Test Hello function")
    @Test
    void testHello() {

        assertEquals("Hello", displayName.hello());
    }

    @org.junit.jupiter.api.DisplayName("Test my talk method where work or not?")
    @Test
    void testTalk() {
        assertEquals("How are you?", displayName.talk());
    }

    @org.junit.jupiter.api.DisplayName("Test Bye method :)))")
    @Test
    void testByye() {
        assertEquals("bye", displayName.bye());
    }
}