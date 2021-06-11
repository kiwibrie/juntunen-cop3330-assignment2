package ex24;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

//Anagram Checker
import java.util.Arrays;
import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args ) {
        App myApp = new App();

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        String input1 = myApp.inputString("Enter the first string");
        String input2 = myApp.inputString("Enter the second string");

        boolean anagram = myApp.isAnagram(input1, input2);

        myApp.printOutput(anagram, input1, input2);
    }

    public String inputString(String prompt){
        System.out.printf("%s: ", prompt);
        return in.nextLine();
    }

    public boolean isAnagram(String input1, String input2){
        if(input1.length() != input2.length()){
            return false;
        }
        char[] string1 = input1.toCharArray();
        char[] string2 = input2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        return Arrays.equals(string1, string2);
    }

    public void printOutput(boolean anagram, String input1, String input2){
        if(anagram){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", input1, input2);
        } else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", input1, input2);
        }
    }
}
