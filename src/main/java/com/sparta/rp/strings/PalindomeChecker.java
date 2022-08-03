package com.sparta.rp.strings;

import com.sparta.rp.MyString;

public class PalindomeChecker {
    public static boolean isPalindrome(String wordToCheck){

        String reversedWord = StringReverser.reverseString(wordToCheck);

        return reversedWord.toLowerCase().equals(wordToCheck.toLowerCase());
    }
}
