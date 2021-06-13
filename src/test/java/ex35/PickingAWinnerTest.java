package ex35;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PickingAWinnerTest {
    PickingAWinner app = new PickingAWinner();

    public ArrayList<String> array = new ArrayList<String>();

    //Random number Genreator
    @Test
    public void test1(){
        array.add("Homer"); array.add("Lisa"); array.add("Lumine"); array.add("Kaeya"); array.add("Amber");
        System.out.print(app.pickWinner(array));
    }

    @Test
    public void test2(){
        array.add("Homer"); array.add("Lisa"); array.add("Lumine"); array.add("Kaeya"); array.add("Amber");
        System.out.print(app.pickWinner(array));
    }

    @Test
    public void test3(){
        array.add("Homer"); array.add("Lisa"); array.add("Lumine"); array.add("Kaeya"); array.add("Amber");
        System.out.print(app.pickWinner(array));
    }

    @Test
    public void test4(){
        array.add("Homer"); array.add("Lisa"); array.add("Lumine"); array.add("Kaeya"); array.add("Amber");
        System.out.print(app.pickWinner(array));
    }
    @Test
    public void test5(){
        array.add("Homer"); array.add("Lisa"); array.add("Lumine"); array.add("Kaeya"); array.add("Amber");
        System.out.print(app.pickWinner(array));
    }

    @Test
    public void test6(){
        array.add("Homer"); array.add("Lisa"); array.add("Lumine"); array.add("Kaeya"); array.add("Amber");
        app.printOutput(0, array);
        app.printOutput(1, array);
        app.printOutput(2, array);
        app.printOutput(3, array);
        app.printOutput(4, array);
    }

}