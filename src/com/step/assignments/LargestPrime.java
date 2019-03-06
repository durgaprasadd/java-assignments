package com.step.assignments;

public class LargestPrime {
    public static int getLargestPrime(int num){
        if(num <2){
            return -1;
        }
        int primeFactor = 0;
        while(num%2 == 0 ){
            primeFactor = 2;
            num /=2;
        }

        for(int factor=3;factor<=num;factor+=2){
            if(num%factor == 0){
                primeFactor = factor;
                num/= factor;
                factor -=2;
            }
        }
        return primeFactor;
    }
}
