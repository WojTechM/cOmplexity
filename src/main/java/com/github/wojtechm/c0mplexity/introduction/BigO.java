package com.github.wojtechm.c0mplexity.introduction;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/**
 * Next: {@link com.github.wojtechm.c0mplexity.examples.palindrome.IsPalindrome}
 *
 * @author Wojciech Makieła
 */
class BigO {

    void constantTime(int[] arr) {
        System.out.println(arr != null ? arr.length : -1); // O(1)
    }

    void linearTime(int[] arr) {
        for (int n : arr) {         // O(n)
            System.out.println(n);  // O(1)
        }
    }

    void logarithmicTime(int[] arr) {
        int i = Arrays.binarySearch(arr, 42);   // O(log n)
        System.out.println(i);                      // O(1)
        // [1,2,3,4,5,6,7,8,9]
    }

    void logLinearTime(int[] arr) {
        int length = arr.length;                    // O(1)
        for (int n : arr) {                         // O(n)
            for (int m = length; m > 0; m /= 2) {   // O(log n)
                int x = n * m;                      // O(1)
                System.out.println(x);              // O(1)
            }
        }
    }

    void quadraticTime(int[] arr) {
        for (int n : arr) {             // O(n)
            for (int m : arr) {         // O(n)
                int x = n * m;          // O(1)
                System.out.println(x);  // O(1)
            }
        }
    }

    void multipliedTime(int[] arr1, int[] arr2) {
        for (int n : arr1) {                // O(n)
            for (int m : arr2) {            // O(m)
                System.out.println(n * m);  // O(1)
            }
        }
    }

    void addedTime(int[] arr1, int[] arr2) {
        for (int n : arr1) {        // O(n)
            System.out.println(n);  // O(1)
        }
        for (int m : arr2) {        // O(m)
            System.out.println(m);  // O(1)
        }
    }
}
