package com.github.wojtechm.c0mplexity.examples.parentheses;

/**
 * Next: {@link BalancedParentheses_02}
 *
 * @author Wojciech Makieła
 */
class BalancedParentheses_01 implements BalancedParentheses {

    @Override
    public boolean check(String parentheses) {
        while (parentheses.contains("()")) {                                 // O()
            parentheses = parentheses.replace("()", "");    // O()
        }
        return parentheses.length() == 0;
    }
}
