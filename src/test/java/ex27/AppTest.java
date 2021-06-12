package ex27;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class AppTest {
    App myApp = new App();

    @Test @DisplayName("example test 1")
    public void test1(){
        String firstname = "J";
        String lastname = "";
        String zipcode = "ABCDE";
        String empID = "A12-1234";

        StringBuilder msg = myApp.validateInputs(firstname, lastname, zipcode, empID);

        System.out.print(msg);
    }

    @Test
    @DisplayName("example test 2")
    public void test2(){
        String firstname = "John";
        String lastname = "Johnson";
        String zipcode = "55555";
        String empID = "TK-4321";

        StringBuilder msg = myApp.validateInputs(firstname, lastname, zipcode, empID);

        System.out.print(msg);
    }

    @Test
    @DisplayName("space in last name")
    public void test3(){
        String firstname = "Jo";
        String lastname = "De Morgan";
        String zipcode = "12345";
        String empID = "TK-1234";

        StringBuilder msg = myApp.validateInputs(firstname, lastname, zipcode, empID);

        System.out.print(msg);
    }

    @Test @DisplayName("bad id")
    public void test4(){
        String firstname = "Jo";
        String lastname = "JOhnson";
        String zipcode = "12345";
        String empID = "TK_1234";

        StringBuilder msg = myApp.validateInputs(firstname, lastname, zipcode, empID);

        System.out.print(msg);
    }

    @Test @DisplayName("bad zip")
    public void test5(){
        String firstname = "Jo";
        String lastname = "JOhnson";
        String zipcode = "123456";
        String empID = "TK-1234";

        StringBuilder msg = myApp.validateInputs(firstname, lastname, zipcode, empID);

        System.out.print(msg);
    }

}