package com.sparta.rp.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class LongestPalindromeTest {
    @Test
    @DisplayName("given a sentence containing a single palindrome return that palindrome")
    void givenASentenceContainsMultiplePalindromesReturnTheLongestPalindrome() {
        String sentence = "Cool racecar";
        String expected = "racecar";
        String answer = LongestPalindromeFinder.findLongestPalindorme(sentence);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("given a sentence contains commas return the longest palindrome")
    void givenASentenceContainsCommasReturnTheLongestPalindrome() {
        String sentence = "Cool,that racecar is better than the, redder, kayak";
        String expected = "racecar";
        String answer = LongestPalindromeFinder.findLongestPalindorme(sentence);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("given a sentence containing a multiple palindromes return the longest palindrome")
    void givenASentenceContainsASinglePalindromeReturnThatPalindrome() {
        String sentence = "wow that kayak is redder than a tomato";
        String expected = "kayak";
        String answer = LongestPalindromeFinder.findLongestPalindorme(sentence);
        Assertions.assertEquals(expected, answer);
    }
    @Test
    @DisplayName("given a sentence containing no palindromes return the appropriate message")
    void givenASentenceContainsNoPalindromeReturnTheAppropriateMessage() {
        String sentence = "there are no palindromes here";
        String expected = "There are no palindromes";
        String answer = LongestPalindromeFinder.findLongestPalindorme(sentence);
        Assertions.assertEquals(expected, answer);
    }
}
