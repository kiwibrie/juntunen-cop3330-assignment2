package ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Brianne Juntunen
 */

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class AppTest 
{
    App myApp = new App();
    @Test @DisplayName("veryweakPassword")
    public void veryweakPassword() {
        String password = "12345";
        assertEquals(1, myApp.passwordValidator(password));
    }

    @Test @DisplayName("weakPassword")
    public void weakPassword() {
        String password = "abcdef";
        assertEquals(2, myApp.passwordValidator(password));
    }

    @Test @DisplayName("strongPassword")
    public void strongPassword() {
        String password = "abc123xyz";
        assertEquals(4, myApp.passwordValidator(password));
    }

    @Test @DisplayName("verystrongPassword")
    public void verystrongPassword() {
        String password = "1337h@xor!";
        assertEquals(5, myApp.passwordValidator(password));
    }

    @Test @DisplayName(">8 num Password")
    public void gr8numPassword() {
        String password = "1234567891011";
        assertEquals(3, myApp.passwordValidator(password));
    }

    @Test @DisplayName("char/nums Password")
    public void halfcharnumPassword() {
        String password = "abc123";
        assertEquals(2, myApp.passwordValidator(password));
    }

    @Test @DisplayName("8char Password")
    public void eightcharPassword() {
        String password = "abcdefgh";
        assertEquals(3, myApp.passwordValidator(password));
    }

    @Test @DisplayName("nonumstrongPassword")
    public void nonumstrongPassword() {
        String password = "abcdefg!?#";
        assertEquals(4, myApp.passwordValidator(password));
    }

    @Test @DisplayName("nospecialstorngPassword")
    public void nospecialstrongPassword() {
        String password = "1234abcdge";
        assertEquals(4, myApp.passwordValidator(password));
    }

}
