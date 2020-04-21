package com.github.wojtechm.c0mplexity.examples.reduce;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Reduce_03Test {

    Reduce reduce = new Reduce_03();

    @Test(dataProvider = "stringsThatShouldNotBeReduced")
    private void should_returnUnchangedString_when_noDuplicateLettersAreNextToEachOther(String toReduce) {
        // act
        String actual = reduce.reduce(toReduce);
        // assert
        assertEquals(actual, toReduce);
    }

    @DataProvider
    private Object[][] stringsThatShouldNotBeReduced() {
        return new Object[][]{
                {"abcde"},
                {"aAaAaA"},
                {"o"},
                {"a"},
                {"test"},
                {"object"},
                {"separated with space"}
        };
    }

    @Test(dataProvider = "stringsThatShouldBeReducedOnce")
    private void should_returnStringReducedOnce_when_noDuplicateLettersAreNextToEachOtherAfterFirstCleanUp(String toReduce, String expected) {
        // act
        String actual = reduce.reduce(toReduce);
        // assert
        assertEquals(actual, expected);
    }

    @DataProvider
    private Object[][] stringsThatShouldBeReducedOnce() {
        return new Object[][]{
                {"Book", "Bk"},
                {"Pillar", "Piar"},
                {"Pillar", "Piar"},
                {"wood", "wd"},
                {"aerodynamically", "aerodynamicay"},
                {"illustriousness", "iustriousne"},
        };
    }

    @Test(dataProvider = "stringsThatShouldBeReducedMultipleTimes")
    private void should_returnFullyReducedString_when_multipleReductionsRequired(String toReduce, String expected) {
        // act
        String actual = reduce.reduce(toReduce);
        // assert
        assertEquals(actual, expected);
    }

    @DataProvider
    private Object[][] stringsThatShouldBeReducedMultipleTimes() {
        return new Object[][]{
                {"cotton", "cn"},
                {"redder", ""},
                {"abba", ""},
                {"abcddcba", ""},
                {"fabcddcbaz", "fz"},
        };
    }

}