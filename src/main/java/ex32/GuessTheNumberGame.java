package ex32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        GuessTheNumberGame app = new GuessTheNumberGame();

        System.out.print("Let's play Guess the Number!\n\n");
        app.startGame();
    }

    public void startGame(){
        int guessCount = 0;
        int difficulty = promptDifficulty();
        int rngNum = generateNumber(difficulty);
        System.out.print("I have my number. What's your guess? ");
        String guess = promptGuess();
        while(!validateGuess(rngNum, guess)){
            guessCount++;
            guess = promptGuess();
        }
        guessCount++;
        System.out.printf("You got it in %d guesses!", guessCount);
        promptPlayAgain();
    }

    public String promptGuess(){
        String input = in.nextLine();
        while(input.length() == 0){
            input = in.nextLine();
        }
        return input;
    }

    public int promptDifficulty(){
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        String input = in.nextLine();
        while(!inputDifficultyValid(input)){
            System.out.print("Please enter a difficulty level. ");
            input = in.nextLine();
        }
        return Integer.parseInt(input);
    }

    public boolean inputDifficultyValid(String input){
        if(input.equals("1") || input.equals("2") || input.equals("3")) return true;
        return false;
    }

    public int generateNumber(int diff){
        Random rand = new Random();
        int max = -1;
        switch (diff){
            case 1: max = 10; break;
            case 2: max = 100; break;
            case 3: max = 1000; break;
        }
        return rand.nextInt(max) + 1;
    }

    public boolean validateGuess(int rngNum, String guess){
        if(!guessIsInt(guess)){
            System.out.print("Please enter a number. Guess again: ");
            return false;
        }
        int guessnum = Integer.parseInt(guess);
        if(rngNum == guessnum) return true;
        else if (rngNum < guessnum){
            System.out.print("Too high. Guess again: ");
        } else {
            System.out.print("Too low. Guess again: ");
        }
        return false;
    }

    public boolean guessIsInt(String input){
        char[] array = input.toCharArray();
        for(int i = 0; i < input.length(); i++){
            if(Character.isAlphabetic(array[i])){
                return false;
            }
        }
        return true;
    }

    public void promptPlayAgain(){
        System.out.print("\n\nDo you wish to play again (Y/N) ? ");
        String input = in.nextLine();
        if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")){
            startGame();
        }
    }
}
