package ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */
import java.util.Scanner;
public class EmployeeListRemoval {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        EmployeeListRemoval app = new EmployeeListRemoval();

        String[] employeeRoster = new String[]{"John Smith", "Jackie Jackson",
                "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        app.printEmployees(employeeRoster);
        String removed = app.promptRemoval();
        employeeRoster = app.removeEmployee(removed, employeeRoster);
        app.printEmployees(employeeRoster);
    }

    public void printEmployees(String[] roster){
        System.out.printf("There are %d employees:\n", roster.length);
        for(int i = 0; i < roster.length; i++){
            if(!roster[i].equalsIgnoreCase("")) System.out.printf("%s\n", roster[i]);
        }
        System.out.print("\n");
    }

    public String promptRemoval(){
        System.out.print("Enter an employee name to remove: ");
        return in.nextLine();
    }

    public String[] removeEmployee(String employee, String[] roster){
        String[] array = new String[roster.length-1];
        for(int i = 0, k = 0; i < roster.length; i++){
            if(!employee.equalsIgnoreCase(roster[i])){
                array[k++] = roster[i];
            }
        }
        return array;
    }
}
