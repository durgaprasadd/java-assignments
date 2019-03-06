package com.step.assignments;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(23));
    }
    public static int sumFirstAndLastDigit(int num) {
        if (num < 0) {
            return -1;
        }
        int lastDigit = num % 10;
        char firstChar = ("" + num).charAt(0);
        int firstDigit = Character.getNumericValue(firstChar);
        return lastDigit + firstDigit;
    }
}
