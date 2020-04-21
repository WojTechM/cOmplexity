package com.github.wojtechm.c0mplexity.introduction;

/**
 * Next: {@link BigO}
 *
 * @author Wojciech Makieła
 */
class WhyDoWeNeedBigO {

    private static boolean simpleContains(int[] sortedArray, int searched) {
        for (int anInt : sortedArray) {
            if (anInt == searched) return true;
        }
        return false;
    }

    private static boolean limitedContains(int[] sortedArray, int searched) {
        for (int anInt : sortedArray) {
            if (anInt == searched) return true;
            else if (anInt > searched) return false;
        }
        return false;
    }

    private static boolean optionalReverseOrderContains(int[] sortedArray, int searched) {
        int diffSearchedFirst = Math.abs(sortedArray[0] - searched);
        int diffSearchedLast = Math.abs(sortedArray[sortedArray.length - 1] - searched);

        if (diffSearchedFirst < diffSearchedLast) {
            for (int anInt : sortedArray) {
                if (anInt == searched) return true;
            }
        } else {
            for (int i = sortedArray.length - 1; i >= 0; i--) {
                if (sortedArray[i] == searched) return true;
            }
        }
        return false;
    }

}
