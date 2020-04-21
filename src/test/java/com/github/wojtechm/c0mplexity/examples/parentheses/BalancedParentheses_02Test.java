package com.github.wojtechm.c0mplexity.examples.parentheses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BalancedParentheses_02Test {

    BalancedParentheses bp = new BalancedParentheses_02();

    @Test(dataProvider = "invalidParentheses")
    public void should_returnFalse_when_parenthesesDoNotMatch(String parentheses) {
        assertFalse(bp.check(parentheses));
    }

    @Test(dataProvider = "validParentheses")
    public void should_returnTrue_when_parenthesesMatch(String parentheses) {
        assertTrue(bp.check(parentheses));
    }

    @DataProvider
    private Object[][] invalidParentheses() {
        return new Object[][] {
                {"()()()("},
                {"()()())"},
                {"()()))"},
                {"())))"},
                {"))))"},
                {"("},
                {"())"},
                {"((())"},
        };
    }

    @DataProvider
    private Object[][] validParentheses() {
        return new Object[][] {
                {"()()()()"},
                {"()()(())()"},
                {"(())()"},
                {"(()(()(()))())()((((((()()))))))"},
        };
    }

}