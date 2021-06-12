package ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    App myApp = new App();

    @Test @DisplayName("caclulate")
    public void calculate(){
        double balance = 5000;
        double apr = 12;
        double payment = 100;
        //assertEquals(70, myApp.calculateCard(balance, apr, payment));
    }

}