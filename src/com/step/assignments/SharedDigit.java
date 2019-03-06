package com.step.assignments;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(22,25));
    }
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            return false;
        }
        int firstDigitOfFirst = a % 10;
        int secondDigitOfFirst = a / 10;
        int firstDigitOfSecond = b % 10;
        int secondDigitOfSecond = b / 10;
        if (firstDigitOfFirst == firstDigitOfSecond || firstDigitOfFirst == secondDigitOfSecond) {
            return true;
        }
        if (secondDigitOfFirst == firstDigitOfSecond || secondDigitOfFirst == secondDigitOfSecond) {
            return true;
        }
        return false;

    }
}
