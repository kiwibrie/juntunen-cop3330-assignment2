package ex36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ComputingStatistics {
    public Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        ComputingStatistics app = new ComputingStatistics();

        ArrayList<Double> arrayList = app.createArrayList();

        double[] computedVales = app.performCalculations(arrayList);

        app.printOutput(arrayList, computedVales);
    }

    public ArrayList<Double> createArrayList(){
        ArrayList<Double> array = new ArrayList<>();
        String newInput = getInput();
        while(!newInput.equalsIgnoreCase("done")){
            array.add(Double.parseDouble(newInput));
            newInput = getInput();
        }
        return array;
    }

    public String getInput(){
        System.out.print("Enter a number: ");
        while(!in.hasNextDouble()){
            if(in.hasNext("done")){
                return in.nextLine();
            }
            System.out.print("Please enter a number: ");
            in.nextLine();
        }
        return in.nextLine();
    }

    public double[] performCalculations(ArrayList<Double> inputArray){
        double[] calcArray = new double[4];
        calcArray[0] = average(inputArray);
        calcArray[1] = min(inputArray);
        calcArray[2] = max(inputArray);
        calcArray[3] = std(inputArray, calcArray[0]);
        return calcArray;
    }

    public double average(ArrayList<Double> array){
        double sum = 0;
        for(int i = 0; i < array.size(); i++){
            sum += array.get(i);
        }
        return sum / array.size();
    }

    public double min(ArrayList<Double> array){
        double min = array.get(0);
        for(int i = 1; i < array.size(); i++){
            if(min > array.get(i)){
                min = array.get(i);
            }
        }
        return min;
    }

    public double max(ArrayList<Double> array){
        double max = array.get(0);
        for(int i = 1; i < array.size(); i++){
            if(max < array.get(i)){
                max = array.get(i);
            }
        }
        return max;
    }

    public double std(ArrayList<Double> array, double average){
        double numerator = 0;
        for(int i = 0; i < array.size(); i++){
            numerator += pow((array.get(i) - average), 2);
        }
        return (sqrt(numerator/ array.size()));
    }

    public void printOutput(ArrayList<Double> inputArray, double[] calc){
        System.out.print("Numbers: "+inputArray+"\n");
        System.out.printf("The average is %.1f\n", calc[0]);
        System.out.printf("The minimum is %.0f\n", calc[1]);
        System.out.printf("The maximum is %.0f\n", calc[2]);
        System.out.printf("The standard deviation is %.2f\n", calc[3]);
    }
}
