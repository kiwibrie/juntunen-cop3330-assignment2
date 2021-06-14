package ex38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FilteringValuesTest {
    FilteringValues app = new FilteringValues();

    @Test
    public void test1(){
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> evenArray = app.filterEvenNumbers(input);
        app.printOutput(evenArray);
    }

    @Test
    public void test2(){
        int[] input = new int[]{2, 0, 22};
        ArrayList<Integer> evenArray = app.filterEvenNumbers(input);
        app.printOutput(evenArray);
    }

    @Test
    public void test3(){
        int[] input = new int[]{1, 3, 5, 7, 9};
        ArrayList<Integer> evenArray = app.filterEvenNumbers(input);
        app.printOutput(evenArray);
    }
}