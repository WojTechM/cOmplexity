package com.github.wojtechm.c0mplexity.examples.palindrome;

/**
 * Next: {@link IsPalindromeButBetter}
 *
 * @author Wojciech Makieła
 */
class IsPalindromeNaive implements IsPalindrome {
    @Override
    public boolean check(String text) {
        return new StringBuilder(text)  // O()
                .reverse()              // O()
                .toString()             // O()
                .equals(text);          // O()
    }
}
