package com.sparta.rp;

import java.util.Locale;

public class MyString {
    public void sayHello(){
        System.out.println("Hello");

    }
    public boolean isInString(   String stringToSearch,String searchString){


        return stringToSearch.contains(searchString);
    }
    public void dislayCharsForwadsAndInReverse(String word ){
        System.out.println("Forwards");
        for (int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
        System.out.println("Backwards");
        for(int i = word.length() -1; i >= 0; i-- ){
            System.out.println(word.charAt(i));
        }
    }
    public String reverseString(String stringToReverse){
        String reversedString = "";
        for(int i = stringToReverse.length() -1; i >= 0; i-- ){
            reversedString += stringToReverse.charAt(i);
        }
        return reversedString;
    }
    public boolean isPalindrome(String wordToCheck){
        MyString myString = new MyString();
        String reversedWord = myString.reverseString(wordToCheck);

        return reversedWord.toLowerCase().equals(wordToCheck.toLowerCase());
    }





}

