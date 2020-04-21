package com.github.wojtechm.c0mplexity.examples.reduce;

/**
 * @author Wojciech Makieła
 */
class Reduce_03 implements Reduce {
    @Override
    public String reduce(String text) {
        StringBuilder result = new StringBuilder();                     // O()
        for (int i = 0; i < text.length(); i++) {                       // O()
            char currentChar = text.charAt(i);                          // O()
            if (stringBuilderEndsWithChar(result, currentChar)) {       // O()
                result.deleteCharAt(result.length() - 1);               // O()
            } else {
                result.append(currentChar);                             // O()
            }
        }

        return result.toString();
    }

    private boolean stringBuilderEndsWithChar(StringBuilder result, char currentChar) {
        return result.length() > 0 && result.charAt(result.length() - 1) == currentChar;
    }
}
