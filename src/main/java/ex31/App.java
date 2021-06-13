package ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

//Karvonen Heart Rate
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App app = new App();

        int age = app.inputInt("What is your age?");
        int pulse = app.inputInt("What is your resting pulse?");

        int[][] table = app.createRateTable(age, pulse);

        app.printOutput(age, pulse, table);
    }

    public void printOutput(int age, int pulse, int[][] table){
        System.out.printf("Resting Pulse: %d\tAge: %d\n\n", pulse, age);
        System.out.print("Intensity\t | Rate\n");
        System.out.print("-------------|--------\n");
        for(int i = 0; i < 9; i++){
            System.out.print(table[0][i]+"%\t\t\t | "+table[1][i]+" bpm\n");
        }
    }

    public int[][] createRateTable(int age, int pulse){
        int[][] table = new int[2][9];
        for(int i = 0; i < 9; i++){
            table[0][i] = 55 + (i*5);
            table[1][i] = calculateTargetHeartRate(age, pulse, table[0][i]);
        }
        return table;
    }

    public int calculateTargetHeartRate(int age, int pulse, int intensity){
        return (int) (((220 - age) - pulse) * (intensity/100.0)) + pulse;
    }

    public int inputInt(String prompt){
        System.out.print(prompt+" ");
        String input = in.nextLine();
        while(!inputValid(input)){
            System.out.print("Please enter a valid number. ");
            System.out.print(prompt+" ");
            input = in.nextLine();
        }
        return Integer.parseInt(input);
    }

    public boolean inputValid(String input){
        if(input.equals("0") || input.equals("")) return false;

        char[] charArray = input.toCharArray();
        for(int i = 0; i < input.length(); i++){
              if(!Character.isDigit(charArray[i])) return false;
        }

        return true;
    }
}
