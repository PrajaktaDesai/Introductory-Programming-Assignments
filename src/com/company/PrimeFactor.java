package com.company;

import java.util.Scanner;

public class PrimeFactor {
    public static boolean isPrime(int n){
        int i;
        for ( i = 2; i < n; i++) {
            if(n%i==0)
                break;
        }
        if(i<n)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        int j=2;
        if(n<2)
            return;
        while (n>0){
            if(isPrime(j)){
                if(n%j==0)
                    System.out.println(j);
            }

            j++;
        }
    }

}
