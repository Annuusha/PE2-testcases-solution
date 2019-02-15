package com.stackroute.PE2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

Palindrome obj;
    @Before
    public void setUp() throws Exception {
        obj=new Palindrome();
    }


    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getPalindromeTestSuccess() {
        String expectedValue = "success";
        String actualValue = obj.getPalindrome("88866888");
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getPalindromeTestFailure() {
        String expectedValue = "failure";
        String actualValue = obj.getPalindrome("123");
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getPalindromeTestSuccessString() {
        String expectedValue = "success";
        String actualValue = obj.getPalindrome("abcba");
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void getPalindromeTestFailureString() {
        String expectedValue = "failure";
        String actualValue = obj.getPalindrome("abc");
        assertEquals(expectedValue, actualValue);
    }


}