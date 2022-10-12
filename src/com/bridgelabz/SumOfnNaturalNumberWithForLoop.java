package com.bridgelabz;

import java.util.Scanner;

public class SumOfnNaturalNumberWithForLoop {

    static void sum( int num ){
        int sum = 0;

        for (int i = 1 ; i <= num ; i++){
            sum += i;
        }
        System.out.println("Sum is " + sum);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        sum(number);
    }
}
