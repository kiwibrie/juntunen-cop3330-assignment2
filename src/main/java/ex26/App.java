package ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

//Months to pay of a credit card
import java.util.Scanner;
import static java.lang.Math.*;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();

        double balance = myApp.inputDouble("What is your balance?");
        double apr = myApp.inputDouble("What is the APR on the card (as a percentage)?");
        double payment = myApp.inputDouble("What is the monthly payment you can make?");

        int months = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment);

        myApp.printOutput(months);
    }

    public void printOutput(int months){
        System.out.printf("It will take you %d months to pay off this card.", months);
    }

    public double inputDouble(String prompt){
        System.out.print(prompt+" ");
        return Double.parseDouble(in.nextLine());
    }
}

class PaymentCalculator{

    public static int calculateMonthsUntilPaidOff(double balance, double apr, double payment){
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        double i = (apr/100)/365;
        double bp = balance / payment;
        double x = 1 - (pow(1+i, 30));
        double y = 1 + bp * x;
        double numerator = log(y);
        double denominator = log(1 + i);

        double months = (-1/30.0) * numerator / denominator;
        if((int)months < months ){
            months = (int) (months) +1;
        }
        return (int) months;
    }

}
