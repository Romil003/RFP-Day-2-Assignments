package com.bridgelabz;

import java.util.Scanner;

public class OperatorPrblm3 {

    static void findingRoots(int a,int b,int c){
        int result = (int)Math.floor(Math.pow(b,2) - 4*a*c);
        int root1 = (int)(-b + Math.sqrt(result))/2*a;
        int root2 = (int)(-b - Math.sqrt(result))/2*a;

        System.out.println("Root 1 of x is " + root1);
        System.out.println("Root 2 of x is " + root2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'a' number : ");
        int a = input.nextInt();
        System.out.print("Enter 'b' number : ");
        int b = input.nextInt();
        System.out.print("Enter 'c' number : ");
        int c = input.nextInt();
        findingRoots(a,b,c);

    }
}
