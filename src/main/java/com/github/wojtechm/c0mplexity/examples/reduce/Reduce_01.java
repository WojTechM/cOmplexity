package com.github.wojtechm.c0mplexity.examples.reduce;

/**
 * Next: {@link Reduce_02}
 *
 * @author Wojciech Makieła
 */
class Reduce_01 implements Reduce {
    @Override
    public String reduce(String text) {
        for (int i = 0; i < text.length() - 1; i++) {                   // O()
            if (text.charAt(i) == text.charAt(i + 1)) {                 // O()
                text = text.substring(0, i) + text.substring(i + 2);    // O()
                i -= 2;                                                 // O()
            }
        }
        return text;                                                    // O()
    }
}
