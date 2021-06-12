package ex30;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

//Multiplication Table
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        int[][] table = myApp.generateTable(12, 12);

        myApp.printOutput(table, 12, 12);
    }

    public void printOutput(int[][] table, int x, int y){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.printf("% 5d", table[i][j]);
            }
            System.out.print("\n");
        }
    }

    public int[][] generateTable(int x, int y){
        int[][] array = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                array[i][j] = (i+1)*(j+1);
            }
        }
        return array;
    }
}
