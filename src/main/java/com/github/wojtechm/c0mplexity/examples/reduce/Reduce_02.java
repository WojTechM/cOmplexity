package com.github.wojtechm.c0mplexity.examples.reduce;

import java.util.Stack;

/**
 * Next: {@link Reduce_03}
 *
 * @author Wojciech Makieła
 */
class Reduce_02 implements Reduce {
    @Override
    public String reduce(String text) {
        Stack<Character> stack = new Stack<>();                     // O()
        for (int i = 0; i < text.length(); i++) {                   // O()
            char currentChar = text.charAt(i);                      // O()
            if (!stack.isEmpty() && stack.peek() == currentChar) {  // O()
                stack.pop();                                        // O()
            } else {
                stack.push(currentChar);                            // O()
            }
        }
        StringBuilder sb = new StringBuilder();                     // O()
        while (!stack.isEmpty()) {                                  // O()
            sb.append(stack.pop());                                 // O()
        }
        return sb.reverse().toString();                             // O()
    }
}
