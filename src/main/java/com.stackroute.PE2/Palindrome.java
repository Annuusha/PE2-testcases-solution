package com.stackroute.PE2;
import java.lang.StringBuilder;

public class Palindrome {

    String res="";
    public String getPalindrome(String palindromeString) {
        StringBuilder input1 = new StringBuilder();
        input1 = input1.append(palindromeString);
        input1 = input1.reverse();

        if (palindromeString.contentEquals(input1)) {
            res = "success";
        } else {
            res = "failure";
        }

        return res;
    }
}
