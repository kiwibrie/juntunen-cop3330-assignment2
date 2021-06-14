package ex38;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */
import java.util.ArrayList;
import java.util.Scanner;
public class FilteringValues {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        FilteringValues app = new FilteringValues();

        int[] input = app.convertInput(app.getInput());
        ArrayList<Integer> evenArray = app.filterEvenNumbers(input);

        app.printOutput(evenArray);
    }

    public void printOutput(ArrayList<Integer> array){
        System.out.print("The even numbers are "+array+".");
    }

    public ArrayList<Integer> filterEvenNumbers(int[] input){
        ArrayList<Integer> array = new ArrayList<>();;
        for(int i = 0; i < input.length; i++){
            if(input[i] % 2 == 0){
                array.add(input[i]);
            }
        }
        return array;
    }

    public int[] convertInput(String[] stringArray){
        int[] intArray = new int[stringArray.length];
        for(int i = 0; i < stringArray.length; i++){
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public String[] getInput(){
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = in.nextLine();
        return input.split(" ");
    }
}
