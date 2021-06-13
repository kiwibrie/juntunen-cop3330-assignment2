package ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeListRemovalTest {
    EmployeeListRemoval app = new EmployeeListRemoval();

    String[] roster = new String[] {"Bella Loca", "Edward Cullen", "Shark Boy",
    "Bellas Dad", "Alice Vampire", "Stephanie Meyer", "Twilight Sparkle"};
    //7 in array

    @Test
    @DisplayName("last in array")
    public void test1(){
        app.printEmployees(app.removeEmployee("Twilight Sparkle", roster));
    }

    @Test
    @DisplayName("first in array")
    public void test2(){
        app.printEmployees(app.removeEmployee("Bella Loca", roster));
    }
}