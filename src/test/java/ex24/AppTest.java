package ex24;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class AppTest 
{
    App myApp = new App();
    @Test
    @DisplayName("AreAnagrams")
    public void areAnagrams() {
        String input1 = "note";
        String input2 = "tone";

        assertTrue(myApp.isAnagram(input1, input2));
    }

    @Test @DisplayName("notAnagrams")
    public void notAnagrams(){
        String input1 = "anagram";
        String input2 = "abcdefg";
        assertFalse(myApp.isAnagram(input1, input2));
    }

    @Test @DisplayName("notLength")
    public void notLength(){
        String input1 = "string";
        String input2 = "stirngg";
        assertFalse(myApp.isAnagram(input1, input2));
    }

    @Test @DisplayName("spaceTrue")
    public void spacesTrue(){
        String input1 = "strin g";
        String input2 = "st irng";
        assertTrue(myApp.isAnagram(input1, input2));
    }

    @Test @DisplayName("spaceFalse")
    public void spacesFalse(){
        String input1 = "strin g";
        String input2 = "st ir ng";
        assertFalse(myApp.isAnagram(input1, input2));
    }

    @Test @DisplayName("endSpaces")
    public void spacesEnd(){
        String input1 = "string    ";
        String input2 = "s t ir n g";
        assertTrue(myApp.isAnagram(input1, input2));
    }

    @Test @DisplayName("exact match")
    public void exactMatch(){
        String input1 = "string";
        String input2 = "string";
        assertTrue(myApp.isAnagram(input1, input2));
    }
}
