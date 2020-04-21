package com.github.wojtechm.c0mplexity.examples.parentheses;

import java.util.Stack;

/**
 * Next: {@link com.github.wojtechm.c0mplexity.examples.reduce.Reduce}
 *
 * @author Wojciech Makieła
 */
class BalancedParentheses_02 implements BalancedParentheses {

    @Override
    public boolean check(String parentheses) {
        Stack<Character> stack = new Stack<>();             // O()
        for (int i = 0; i < parentheses.length(); i++) {    // O()
            char current = parentheses.charAt(i);           // O()
            if (current == '(') {                           // O()
                stack.push(current);                        // O()
            } else if (stack.isEmpty()) return false;       // O()
            else stack.pop();                               // O()
        }
        return stack.isEmpty();                             // O()
    }
}
