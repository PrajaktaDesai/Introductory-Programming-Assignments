package com.company;

import java.util.Scanner;
public class IsoscelesTriangle {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for (int i = 0; i <n ; i++) {
           int spaces= n-i-1;
            for (int j = 0; j <spaces ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i*2+1 ; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
