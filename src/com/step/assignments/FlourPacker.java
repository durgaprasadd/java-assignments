package com.step.assignments;

public class FlourPacker {
    public static boolean canPack(int bigCount,int smallCount, int goal){
        if(bigCount<0||smallCount<0||goal<0){
            return false;
        }
        int remaining = goal - bigCount*5;
        if(remaining<0){
            remaining = goal%5;
        }
        remaining = remaining - smallCount*1;
        return remaining <= 0;
    }
}
