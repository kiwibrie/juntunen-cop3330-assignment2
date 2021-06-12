package ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentCalculatorTest {

    @Test
    @DisplayName("example 1")
    public void test1(){
        double balance = 5000;
        double apr = 12;
        double payment = 100;

        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment));
    }

    @Test
    @DisplayName("test 2")
    public void test2(){
        double balance = 1750;
        double apr = 14;
        double payment = 500;

        assertEquals(4, PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment));
    }

    @Test @DisplayName("test 3")
    public void test3(){
        double balance = 12000;
        double apr = 12;
        double payment = 200;

        assertEquals(92, PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment));
    }
}