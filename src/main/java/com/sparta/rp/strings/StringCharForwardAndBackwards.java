package com.sparta.rp.strings;

public class StringCharForwardAndBackwards {
    public void displayCharsOfString(String word ){
        System.out.println("Forwards");
        for (int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }
        System.out.println("Backwards");
        for(int i = word.length() -1; i >= 0; i-- ){
            System.out.println(word.charAt(i));
        }
    }
}
