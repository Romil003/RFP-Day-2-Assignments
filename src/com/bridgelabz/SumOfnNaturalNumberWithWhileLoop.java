package com.bridgelabz;

import java.util.Scanner;

public class SumOfnNaturalNumberWithWhileLoop {

    static void sum( int number ){
        int i = 1;
        int sum = 0;
        while(i<=number){
            sum += i;
            i++;
        }

        System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.print("Sum is ");
        sum(number);
    }
}
