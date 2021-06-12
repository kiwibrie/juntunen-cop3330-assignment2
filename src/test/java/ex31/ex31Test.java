package ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ex31Test {
    App app = new App();

    @Test
    @DisplayName("character input")
    public void test1(){
        assertFalse(app.inputValid("abcde"));
    }

    @Test
    @DisplayName("negative input")
    public void test2(){
        assertFalse(app.inputValid("-98"));
    }

    @Test
    @DisplayName("zero input")
    public void test3(){
        assertFalse(app.inputValid("0"));
    }

    @Test
    @DisplayName("null input")
    public void test4(){
        assertFalse(app.inputValid(""));
    }
}