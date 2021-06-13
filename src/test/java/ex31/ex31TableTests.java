package ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.Test;

public class ex31TableTests {
    App app = new App();

    @Test
    @DisplayName("22 65")
    public void test1(){
        int age = 22, pulse = 65;
        app.printOutput(age, pulse, app.createRateTable(age, pulse));
    }

    @Test
    @DisplayName("30 70")
    public void test2(){
        int age = 30, pulse = 70;
        app.printOutput(age, pulse, app.createRateTable(age, pulse));
    }

    @Test
    @DisplayName("100 50")
    public void test3(){
        int age = 100, pulse = 50;
        app.printOutput(age, pulse, app.createRateTable(age, pulse));
    }
}