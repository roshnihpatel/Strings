package com.sparta.rp.strings;

import com.sparta.rp.MyString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PalindromeCheckerTest {
    @Test
    @DisplayName("Given a word, return true if the word is a palindrome")
    void givenAWordReturnTrueIfTheWordIsAPalindrome(){
        String word = "Racecar";
        boolean expected = true;

        boolean answer = PalindomeChecker.isPalindrome(word);
        Assertions.assertEquals(expected,answer);
    }
    @Test
    @DisplayName("Given an empty string, isPalindrome should return true")
    void givenAnEmptyStringReturnTrue(){
        String word = "";
        boolean expected = true;
        MyString stringForTest = new MyString();
        boolean answer = PalindomeChecker.isPalindrome(word);
        Assertions.assertEquals(expected,answer);
    }
    @Test
    @DisplayName("Given a word, isPalindrome should return false if it is not a palindrome")
    void givenAWordReturnFalseIfItIsNotAPalindrome(){
        String word = "Green";
        boolean expected = false;
        MyString stringForTest = new MyString();
        boolean answer = PalindomeChecker.isPalindrome(word);
        Assertions.assertEquals(expected,answer);
    }
}
