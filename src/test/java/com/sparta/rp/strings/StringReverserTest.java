package com.sparta.rp.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringReverserTest {
    @Test
    @DisplayName("Given a string, return the reversed string")
    void givenAStringReturnTheReversedString(){
        String word = "HIJKL";
        String expected = "LKJIH";

        String answer = StringReverser.reverseString(word);
        Assertions.assertEquals(expected,answer);
    }
}
