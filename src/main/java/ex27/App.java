package ex27;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

//Validating Inputs
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();

        String firstname = myApp.inputString("Enter the first name");
        String lastname = myApp.inputString("Enter the last name");
        String zipcode = myApp.inputString("Enter the ZIP code");
        String empID = myApp.inputString("Enter the employee ID");

        StringBuilder errors = myApp.validateInputs(firstname, lastname, zipcode, empID);

        if(errors.length() == 0){
            errors.append("There were no errors found.\n");
        }
        myApp.printOutput(errors);

    }
    
    public void printOutput(StringBuilder msg){
        System.out.print(msg);
    }

    public StringBuilder validateInputs(String fname, String lname, String zip, String id) {
        StringBuilder output = new StringBuilder();

        validateFirstName(fname, output);
        validateLastName(lname, output);
        validateID(id, output);
        validateZIP(zip, output);

        return output;
    }

    public void validateFirstName(String name, StringBuilder output){
        if(name.length() < 2){
            output.append("The first name must be at least 2 characters.\n");
            validateNoInput("first name", name, output);
        }
    }

    public void validateLastName(String name, StringBuilder output){
        if(name.length() < 2){
            output.append("The last name must be at least 2 characters.\n");
            validateNoInput("last name", name, output);
        }
    }

    public void validateID(String id, StringBuilder output){
        if(id.length() == 7){
            char[] array = id.toCharArray();
            if(array[2] == '-'){
                if(!(Character.isDigit(array[0]) || Character.isDigit(array[1]))){
                    if(Character.isDigit(array[3]) && Character.isDigit(array[4])
                            && Character.isDigit(array[5]) && Character.isDigit(array[6])){
                        return;
                    }
                }
            }
        }

        output.append("The employee ID must be in the format of AA-1234.\n");
        validateNoInput("employee ID", id, output);
    }

    public void validateZIP(String zip, StringBuilder output){
        if(zip.length() != 5){
            output.append("The zipcode must be a 5 digit number.\n");
            validateNoInput("zipcode", zip, output);
        }

        char[] array = zip.toCharArray();
        for(int i = 0; i < 5; i++){
            if(!Character.isDigit(array[i])){
                output.append("The zipcode must be a 5 digit number.\n");
                return;
            }
        }
    }

    public void validateNoInput(String msg, String input, StringBuilder output){
        if(input.length() == 0){
            output.append("The ").append(msg).append(" must be filled in.\n");
        }
    }

    public String inputString(String prompt){
        System.out.print(prompt+": ");
        return in.nextLine();
    }
}
