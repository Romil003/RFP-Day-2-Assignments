package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumberWithWhileLoop {

    static void reversingNumber(int number){
        int a = number;

        int reverseNum = 0;
        int remainder = 0;

        while(number != 0){
            remainder = number%10;
            reverseNum = reverseNum*10 + remainder;
            number /= 10;
        }

        System.out.println("Reverse Number of " + a + " is " + reverseNum);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = input.nextInt();
        reversingNumber(num);

    }
}
