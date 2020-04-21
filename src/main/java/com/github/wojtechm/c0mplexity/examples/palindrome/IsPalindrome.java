package com.github.wojtechm.c0mplexity.examples.palindrome;

/**
 * Given a String 'text' check, if it is a palindrome.
 * Palindrome is a string that says the same, when you reverse order of characters.
 *
 * "abba" -> true
 * "abcba" -> true
 * "abbc" -> false
 * "ABba" -> false
 *
 * Next: {@link IsPalindromeNaive}
 * @author Wojciech Makieła
 */
public interface IsPalindrome {

    boolean check(String text);
}
