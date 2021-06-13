package ex33;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import java.util.Random;
import java.util.Scanner;
public class Magic8Ball {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        Magic8Ball app = new Magic8Ball();

        String[] eightball = new String[]{"Yes.", "No.", "Maybe.", "Ask again later."};

        System.out.print("What's your question?\n> ");
        app.userTime();
        System.out.print(app.generateMessage(eightball));
    }

    public void userTime(){
        in.nextLine();
    }

    public String generateMessage(String[] array){
        Random rand = new Random();
        return array[rand.nextInt(4)];
    }
}
