package com.github.wojtechm.c0mplexity.examples.palindrome;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IsPalindromeNaiveTest {

    IsPalindrome isPalindrome = new IsPalindromeNaive();

    @Test(dataProvider = "stringsShorterThan2Characters")
    public void should_returnTrue_when_textIsShorterThan2CharactersLong(String text) {
        assertTrue(isPalindrome.check(text));
    }

    @Test(dataProvider = "palindromesLongerThan1")
    public void should_returnTrue_when_textIsLongerThan1AndIsPalindrome(String text) {
        assertTrue(isPalindrome.check(text));
    }

    @Test(dataProvider = "notPalindromes")
    public void should_returnFalse_when_stringIsNotAPalindrome(String text) {
        assertFalse(isPalindrome.check(text));
    }

    @DataProvider
    private Object[][] stringsShorterThan2Characters() {
        return new Object[][] {
                {""},
                {"a"},
                {"b"},
                {"c"},
                {"1"},
                {"2"},
                {"3"},
                {"Ż"},
                {"Ą"},
        };
    }

    @DataProvider
    private Object[][] palindromesLongerThan1() {
        return new Object[][] {
                {"aa"},
                {"abba"},
                {"abbba"},
                {"12321"},
                {"żółćłóż"},
                {"żółććłóż"},
                {"qwertyuioppoiuytrewq"},
        };
    }

    @DataProvider
    private Object[][] notPalindromes() {
        return new Object[][] {
                {"1aa"},
                {"a113a"},
                {"aa1"},
                {"baaa"},
                {"abaa"},
                {"aaba"},
                {"aaab"},
                {"żółć łóż"},
                {"not a palindrome"},
                {"Surprisingly, this is not a palindrome too!"},
        };
    }
}