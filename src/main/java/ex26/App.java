package ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

//Months to pay of a credit card
import java.util.Scanner;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();

        double balance = myApp.inputDouble("What is your balance?");
        double apr = myApp.inputDouble("What is the APR on the card (as a percentage)?");
        double payment = myApp.inputDouble("What is the monthly payment you can make?");

        int months = myApp.calculateCard(balance, apr, payment);

        myApp.printOutput(months);
    }

    public void printOutput(int months){
        System.out.printf("It will take you %d months to pay off this card.", months);
    }

    public double inputDouble(String prompt){
        System.out.print(prompt+" ");
        return Double.parseDouble(in.nextLine());
    }

    public int calculateCard(double b, double apr, double p){
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double i = (apr)/365;
        double middle = log(1 + b/p * (1 - pow(1+i, 30)));
        return (int) (-(1/30) * middle / log(1 + i));
    }
}
