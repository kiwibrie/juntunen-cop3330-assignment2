package ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

//Password Strength Indicator
import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args ) {
        App myApp = new App();

        String password = myApp.inputString();

        int strength = myApp.passwordValidator(password);

        myApp.printOutput(strength, password);
    }

    public String inputString(){
        System.out.println("Please enter a password: ");
        return in.nextLine();
    }

    public int passwordValidator(String password){
        int hasNum = numValidator(password);
        int hasSpecial = specialValidator(password);

        if(password.length() < 8){
            if(hasNum > 0){
                if(hasNum == password.length()) return 1;
            }
            return 2;
        } else {
            if((hasNum == password.length()) || (hasSpecial == password.length())) return 3;
            if(hasNum > 0){
                if(hasSpecial > 0){
                    return 5;
                }
                return 4;
            } else if (hasSpecial > 0){
                return 4;
            }
            return 3;
        }
    }

    public void printOutput(int strength_lvl, String password){
        String strength;
        switch (strength_lvl){
            case 1: strength = " very weak"; break;
            case 2: strength = " weak"; break;
            case 3: strength = " fair"; break;
            case 4: strength = " strong"; break;
            case 5: strength = " very strong"; break;
            default: strength = "";
        }

        System.out.printf("The password '%s' is a%s password.", password, strength);
    }

    public int numValidator(String password){
        char[] array = password.toCharArray();
        int count = 0;
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(array[i])){
                count++;
            }
        }
        return count;
    }

    public int specialValidator(String password){
        char[] charSearch = {'\'', '"', '/', '.', ',', '>', '<', '!', '?',
                '@', '#', '$', '%', '&', '*', '(', ')', '-', '+', '=', '_',
                ';', ':', '~'}; //i dont know what special chars to include :/
        int count = 0;
        for(int i = 0; i < password.length(); i++){
            char chr = password.charAt(i);
            for(int j = 0; j < charSearch.length; j++){
                if(charSearch[j] == chr) count++;
            }
        }
        return count;
    }

}
