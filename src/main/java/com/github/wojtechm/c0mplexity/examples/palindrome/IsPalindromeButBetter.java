package com.github.wojtechm.c0mplexity.examples.palindrome;

/**
 * Next: {@link com.github.wojtechm.c0mplexity.examples.parentheses.BalancedParentheses}
 *
 * @author Wojciech Makieła
 */
class IsPalindromeButBetter implements IsPalindrome {
    @Override
    public boolean check(String text) {
        for (int i = 0; i < text.length(); i++) {                   // O()
            int j = text.length() - 1 - i;                          // O()
            if (text.charAt(i) != text.charAt(j)) return false;     // O()
        }
        return true;
    }
}
