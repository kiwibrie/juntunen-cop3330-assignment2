package ex32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ex32DifficultyTest {
    GuessTheNumberGame app = new GuessTheNumberGame();

    @Test
    @DisplayName("letter input")
    public void test1(){
        assertFalse(app.inputDifficultyValid("three"));
    }

    @Test
    @DisplayName("non 123 input")
    public void test2(){
        assertFalse(app.inputDifficultyValid("4"));
    }

    @Test
    @DisplayName("123 input")
    public void test3(){
        assertFalse(app.inputDifficultyValid("123"));
    }

    @Test
    @DisplayName("good input")
    public void test4(){
        assertTrue(app.inputDifficultyValid("2"));
    }
}