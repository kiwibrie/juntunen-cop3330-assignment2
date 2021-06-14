package ex37;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import java.util.*;

public class PasswordGenerator {
    static Scanner in = new Scanner(System.in);

    List<Character> integerList = createIntegerList();
    List<Character> characterList = createStringList();
    List<Character> specialList = createSpecialList();

    public static void main(String[] args){
        PasswordGenerator app = new PasswordGenerator();

        int length = app.promptInput("What's the minimum length? ");
        int schar = app.promptInput("How many special characters? ");
        int nums = app.promptInput("How many numbers? ");

        while(!app.validateGoodPractice(length, schar, nums)){
            System.out.print("These requirements cannot give you a secure password. Proceed anyway? (Y/N) ");
            if((!in.nextLine().equalsIgnoreCase("yes")) || (!in.nextLine().equalsIgnoreCase("y"))){
                length = app.promptInput("What's the minimum length? ");
                schar = app.promptInput("How many special characters? ");
                nums = app.promptInput("How many numbers? ");
            }
        }

        String password = Arrays.toString(app.generatePassword(length, schar, nums));

        app.printOutput(password);
    }

    public void printOutput(String pass){
        System.out.printf("Your password is %s", pass);
    }

    public char[] generatePassword(int length, int schar, int nums){
        char[] array = new char[length];
        int[] pseudopass = generatePseudoPass(length, schar, nums);
        for(int i = 0; i < length; i++){
            switch(pseudopass[i]){
                case 0: array[i] = integerList.get(rng(10)); break;
                case 1: array[i] = specialList.get(rng(10)); break;
                default: array[i] = characterList.get(rng(23));
            }
        }
        return array;
    }

    public int[] generatePseudoPass(int length, int schar, int nums){
        int[] array = new int[length];
        int curnum = 0, curschar = 0;
        for(int i = 0; i < length; i++){
            array[i] = rng(3);
            switch (array[i]){
                case 0:
                    if(curnum == nums) {
                        array[i] = rng(2) +1; break;
                    }
                    curnum++; break;
                case 1:
                    if(curschar == schar) {
                        array[i] = 2; break;
                    }
                    curschar++; break;
            }
        }
        if(curnum != nums && curschar != schar){
            array = generatePseudoPass(length, schar, nums);
        }
        System.out.print(array);
        return array;
    }

    public int rng(int upperbound){
        Random rand = new Random();
        return rand.nextInt(upperbound);
    }

    public boolean validateGoodPractice(int length, int schar, int nums){
        return (schar + nums) <= (length - (schar + nums));
    }

    public int promptInput(String prompt){
        System.out.print(prompt);
        while(!in.hasNextInt()){
            System.out.print("Please enter a number. ");
            in.nextLine();
        }
        return Integer.parseInt(in.nextLine());
    }

    public List<Character> createIntegerList(){
        List<Character> list = new ArrayList<>();
        list.add('0'); list.add('1'); list.add('2'); list.add('3'); list.add('4');
        list.add('5'); list.add('6'); list.add('7'); list.add('8'); list.add('9');
        return list;
    }

    public List<Character> createStringList(){
        //omitting i, l, o for ease of reading
        List<Character> list = new ArrayList<>();
        list.add('q'); list.add('w'); list.add('e'); list.add('r'); list.add('t');
        list.add('y'); list.add('u'); list.add('p'); list.add('a'); list.add('s');
        list.add('d'); list.add('f'); list.add('g'); list.add('h'); list.add('j');
        list.add('k'); list.add('z'); list.add('x'); list.add('c'); list.add('v');
        list.add('b'); list.add('n'); list.add('m');
        return list;
    }

    public List<Character> createSpecialList(){
        //including only the most accepted password inputs
        List<Character> list = new ArrayList<>();
        list.add('!'); list.add('?'); list.add('@'); list.add('#'); list.add('$');
        list.add('%'); list.add('_'); list.add('-'); list.add('.'); list.add('&');
        return list;
    }
}
