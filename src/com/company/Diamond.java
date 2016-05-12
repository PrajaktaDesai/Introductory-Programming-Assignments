package com.company;

import java.util.Scanner;

public class Diamond {
    public static int n;
    public static void printStar(int spaces, int stars){
        if(stars==(n+1)*2-1)
        return;
        for (int i = 0; i <spaces ; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i <stars ; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        printStar(spaces-1, stars+2);
    }

    public static void printStarsREverse(int spaces, int stars){
        if(stars<1)
            return;
        for (int i = 0; i <spaces ; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i <stars ; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        printStarsREverse(spaces+1, stars-2);
    }
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
         n = scanner.nextInt();
        printStar(n-1,1);
        printStarsREverse(1,n*2-3);
    }
}
