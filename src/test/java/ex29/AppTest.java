package ex29;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    App app = new App();

    @Test
    @DisplayName("example test")
    public void test1(){
        assertEquals(18, app.calculateReturn(4));
    }

    @Test
    @DisplayName("big rate")
    public void test2(){
        assertEquals(0, app.calculateReturn(120));
    }

    @Test
    @DisplayName("negative rate")
    public void test3(){
        assertEquals(-18, app.calculateReturn(-4));
    }
}