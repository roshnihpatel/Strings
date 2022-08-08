package com.sparta.rp.strings;

public class LongestPalindromeFinder {
    public static String findLongestPalindorme(String sentence){
        int longestLength = 0;
        String longestPalindrome = "There are no palindromes";
        String [] words  = sentence.split("[\s,]");
        for (String word : words ){
            if(PalindomeChecker.isPalindrome(word)){
                if (word.length() > longestLength){
                    longestPalindrome = word;
                    longestLength = word.length();
                }
            }
        }
        return longestPalindrome;
    }


}
