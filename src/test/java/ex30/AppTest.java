package ex30;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    App myApp = new App();

    @Test
    @DisplayName("12x12")
    public void test1(){
        int[][] table = myApp.generateTable(12, 12);
        myApp.printOutput(table, 12, 12);
    }

    @Test
    @DisplayName("14x14")
    public void test2(){
        int x = 14, y = 14;
        int[][] table = myApp.generateTable(x, y);
        myApp.printOutput(table, x, y);
    }

    @Test
    @DisplayName("5x5")
    public void test3(){
        int x = 5, y = 5;
        int[][] table = myApp.generateTable(x, y);
        myApp.printOutput(table, x, y);
    }
}