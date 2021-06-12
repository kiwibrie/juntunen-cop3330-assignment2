package ex28;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

//Adding Numbers
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();

        int loop = 5;
        int[] input = new int[loop];
        input = myApp.getInputs(input, loop);

        int sum = myApp.calculateSum(input);

        myApp.printOutput(sum);
    }

    public void printOutput(int sum){
        System.out.printf("The total is %d.", sum);
    }

    public int calculateSum(int[] inputArray){
        int sum = 0;
        for(int i = 0; i < inputArray.length; i++){
            sum += inputArray[i];
        }
        return sum;
    }

    public int[] getInputs(int[] inputArray, int x){
        for(int i = 0; i < x; i++){
            inputArray[i] = inputInt();
        }
        return inputArray;
    }

    public int inputInt(){
        System.out.print("Enter a number: ");
        return Integer.parseInt(in.nextLine());
    }

}
