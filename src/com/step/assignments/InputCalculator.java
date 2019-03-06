package com.step.assignments;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        float counter = 0;
        while (reader.hasNextInt()){
            int num = reader.nextInt();
            sum += num;
            counter += 1;
            avg = Math.round(sum/counter);
        }
        System.out.println("SUM = "+sum+" AVG = "+avg);
    }
}
