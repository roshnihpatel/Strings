package com.sparta.rp.strings;

public class StringReverser {
    public static String reverseString(String stringToReverse){
        String reversedString = "";
        for(int i = stringToReverse.length() -1; i >= 0; i-- ){
            reversedString += stringToReverse.charAt(i);
        }
        return reversedString;
    }
}
