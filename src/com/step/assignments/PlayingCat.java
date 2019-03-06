package com.step.assignments;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,45));
    }
    public static boolean isCatPlaying(boolean condition, int temperature) {
        if (!condition && (temperature < 25 || temperature > 35)) {
            return false;
        }
        if (condition && (temperature < 25 || temperature > 45)) {
            return false;
        }
        return true;
    }
}
