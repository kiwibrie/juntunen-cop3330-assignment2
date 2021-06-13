package ex32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ex32ValidateGuessTest {
    GuessTheNumberGame app = new GuessTheNumberGame();

    @Test
    @DisplayName("all letter input")
    public void test1(){
        assertFalse(app.validateGuess(3, "three"));
    }

    @Test
    @DisplayName("all num input")
    public void test2(){
        assertTrue(app.validateGuess(56, "56"));
    }

    @Test
    @DisplayName("letter then num input")
    public void test3(){
        assertFalse(app.validateGuess(123, "hehe123"));
    }

    @Test
    @DisplayName("num then letter input")
    public void test4(){
        assertFalse(app.validateGuess(123, "123hehe"));
    }

}