package com.step.assignments;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-12321));
    }
    public static boolean isPalindrome(int num) {
        if (num < 0) {
            num *= -1;
        }
        String actual = new StringBuilder("" + num).reverse().toString();
        String expected = new StringBuilder("" + num).toString();
        return actual.equals(expected);
    }
}
