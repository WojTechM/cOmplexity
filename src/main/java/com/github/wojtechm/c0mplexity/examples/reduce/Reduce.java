package com.github.wojtechm.c0mplexity.examples.reduce;

/**
 * Given a String consisting of alphabetic characters only,
 * write a method - reduce that returns the given string with all equal characters
 * next to each other removed. Operation stops when no duplicates are neighboring;
 *
 * "book"   => "bk"
 * "abba"   => ""
 * "abcba"  => "abcba"
 * "aAaAaA" => "aAaAaA"
 * "ooabc"  => "abc"
 *
 * Next: {@link Reduce_01}
 * @author Wojciech Makieła
 */
public interface Reduce {

    String reduce(String text);
}
