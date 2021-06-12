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
        if(input.contains("[a~z]") || input.contains("-") ||
                input.equals("0") || input.equals("")){
            return false;
        }
        return true;
    }
}
