package com.sparta.rp.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class InStringCheckerTest {
    @ParameterizedTest
    @ValueSource(strings = {"h", "ell" , "lo", " ", "world"})
    @DisplayName("Given a substring and string to check, return true if the substring is contained in the string")
    void givenASubstringAndStringReturnTrueIfTheSubstringIsContained(String substring){
        boolean expected = true;
        String stringToCheck = "hello world";
        boolean answer = InStringChecker.isInString(stringToCheck,substring );
        Assertions.assertEquals(expected, answer);

    }

}
