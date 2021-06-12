package ex29;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

//Handing Bad Input
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double rate = myApp.inputDouble();

        int years = myApp.calculateReturn(rate);

        myApp.printOutput(years);
    }

    public void printOutput(int years){
        System.out.printf("It will take %d years to double your initial investment.", years);
    }

    public int calculateReturn(double rate){
        return (int) (72 / rate);
    }

    public double inputDouble(){
        System.out.print("What is the rate of return? ");
        while (!in.hasNextDouble() || in.hasNext("0") || in.hasNext("0.0")) {
            System.out.print("Sorry. That's not a valid input.\n");
            System.out.print("What is the rate of return? ");
            in.nextLine();
        }
        return Double.parseDouble(in.nextLine());
    }
}
