package com.github.wojtechm.c0mplexity.examples.parentheses;

/**
 * Given a String 'parentheses' check, if all opening brackets have matching closing bracket.
 *
 * '()' -> true
 * ')(' -> false
 * '(())' -> true
 * '()()' -> true
 *
 * Next: {@link BalancedParentheses_01}
 * @author Wojciech Makieła
 */
public interface BalancedParentheses {

    boolean check(String parentheses);
}
