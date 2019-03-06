package com.step.assignments;

public class DiagonalStar {
    public static void printSquareStar(int num){
        if(num < 5){
            System.out.println("Invalid Value");
            return;
        }
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1 || i==num||j == 1|| j==num || i == j || j == num-i+1){
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
