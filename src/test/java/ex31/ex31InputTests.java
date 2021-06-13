package ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ex31InputTests {
    App app = new App();

    @Test
    @DisplayName("character input")
    public void test1() {
        assertFalse(app.inputValid("abcde"));
    }

    @Test
    @DisplayName("negative input")
    public void test2() {
        assertFalse(app.inputValid("-98"));
    }

    @Test
    @DisplayName("zero input")
    public void test3() {
        assertFalse(app.inputValid("0"));
    }

    @Test
    @DisplayName("null input")
    public void test4() {
        assertFalse(app.inputValid(""));
    }

    @Test
    @DisplayName("good input")
    public void test5(){
        assertTrue(app.inputValid("12345"));
    }
}
