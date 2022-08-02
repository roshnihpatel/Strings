package com.sparta.rp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */
public class MyStringTest
{

    @Test
    @DisplayName("Given a string, return the reversed string")
     void givenAStringReturnTheReversedString(){
        String word = "HIJKL";
        String expected = "LKJIH";
        MyString stringForTest = new MyString();
        String answer = stringForTest.reverseString(word);
        Assertions.assertEquals(expected,answer);
    }
    @Test
    @DisplayName("Given a word, return true if the word is a palindrome")
    void givenAWordReturnTrueIfTheWordIsAPalindrome(){
        String word = "Racecar";
        boolean expected = true;
        MyString stringForTest = new MyString();
        boolean answer = stringForTest.isPalindrome(word);
        Assertions.assertEquals(expected,answer);
    }
    @Test
    @DisplayName("Given an empty string, isPalindrome should return true")
    void givenAnEmptyStringReturnTrue(){
        String word = "";
        boolean expected = true;
        MyString stringForTest = new MyString();
        boolean answer = stringForTest.isPalindrome(word);
        Assertions.assertEquals(expected,answer);
    }
    @Test
    @DisplayName("Given a word, isPalindrome should return false if it is not a palindrome")
    void givenAWordReturnFalseIfItIsNotAPalindrome(){
        String word = "Green";
        boolean expected = false;
        MyString stringForTest = new MyString();
        boolean answer = stringForTest.isPalindrome(word);
        Assertions.assertEquals(expected,answer);
    }

}
