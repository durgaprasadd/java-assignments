package com.step.assignments;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(198,204));
    }
    public static int getGreatestCommonDivisor(int a, int b) {
        if (a < 10 || b < 10) {
            return -1;
        }
        int gcd = Math.min(a, b);
        while (true) {
            if (a % gcd == 0 && b % gcd == 0) {
                return gcd;
            }
            gcd--;
        }
    }
}
