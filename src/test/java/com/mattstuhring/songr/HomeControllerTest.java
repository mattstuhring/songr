package com.mattstuhring.songr;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void capitalizeWords() {
        assertEquals("HELLO", HomeController.capitalizeWords("hello"));
    }

    @Test
    public void reverseOrderOfWords() {
        assertEquals("program to like I", HomeController.reverseOrderOfWords("I like to program"));
    }
}