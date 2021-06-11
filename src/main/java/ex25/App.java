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
        boolean hasNum = numValidator(password);
        boolean hasChar = charValidator(password);
        boolean hasSpecial = specialValidator(password);

        if(password.length() < 8){ //less than 8 chars, v weak / weak
            if(hasNum && !hasChar){
                return 1; //only num, very weak
            } else if (hasChar && !hasNum){
                return 2; //only char, weak
            } else {
                return 3; //char&&num, <8, fair
            }
        } else { // >= 8 chars
            if(hasNum && hasChar){
                return 4; //strong
            } else if (hasNum && hasChar && hasSpecial){
                return 5; //very strong
            } else {
                return 3; //fair
            }
        }
    }

    public void printOutput(int strengthlvl, String password){
        String strength;
        switch (strengthlvl){
            case 1: strength = "very weak ";
            case 2: strength = "weak ";
            case 3: strength = "fair ";
            case 4: strength = "strong ";
            case 5: strength = "very strong";
            default: strength = "";
        }

        System.out.printf("The password '%s' is a %spassword.", password, strength);
    }

    public boolean numValidator(String password){
        char[] array = password.toCharArray();
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(array[i])){
                return true;
            }
        }
        return false;
    }

    public boolean charValidator(String password){


    }

    public boolean specialValidator(String password){
        char[] charSearch = {'\'', '"', '/', '.', ',', '>', '<', '!', '?',
                '@', '#', '$', '%', '&', '*', '(', ')', '-', '+', '=', '_',
                ';', ':'};
        for(int i = 0; i < password.length(); i++){
            char chr = password.charAt(i);
            for(int j = 0; j < charSearch.length; j++){
                if(charSearch[j] == chr) return true;
            }
        }
        return false;
    }

}
