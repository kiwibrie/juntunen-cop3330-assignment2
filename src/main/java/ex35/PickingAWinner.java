package ex35;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class PickingAWinner {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        PickingAWinner app = new PickingAWinner();

        ArrayList<String> gamerarray = app.createGamers();
        int winner = app.pickWinner(gamerarray);
        app.printOutput(winner, gamerarray);
    }

    public ArrayList<String> createGamers(){
        ArrayList<String> array = new ArrayList<>();
        String newGamer = getInput();
        while(!newGamer.equals("")){
            array.add(newGamer);
            newGamer = getInput();
        }
        return array;
    }

    public String getInput(){
        System.out.print("Enter a name: ");
        return in.nextLine();
    }

    public int pickWinner(ArrayList<String> arrayList){
        //if nothing in array, break everything lol
        Random rand = new Random();
        return rand.nextInt(arrayList.size());
    }

    public void printOutput(int winner, ArrayList<String> array){
        System.out.printf("The winner is... %s.", array.get(winner));
    }

}
