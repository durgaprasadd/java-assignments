package com.step.assignments;

public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(10,3,3);
    }
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (a == b && b == c) {
            System.out.println("All numbers are equal");
            return;
        }
        if (a != b && b != c && a != c) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
    }
}
