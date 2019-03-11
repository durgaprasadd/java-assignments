package com.step.day6;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {1,2,5,4,6,0,10};
        for (int i = 0; i < numbers.length-1; i++) {
            for (int i1 = i+1; i1 < numbers.length; i1++) {
                if(numbers[i] < numbers[i1]){
                    int temp = numbers[i];
                    numbers[i] = numbers[i1];
                    numbers[i1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
