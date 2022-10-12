package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumberWithForLoop {

    static void reversingNumber( int num ){
            int b = num;
            int remainder = 0;
            int reverseNumber = 0;

            for (int i = num; i != 0; i /= 10){
                remainder = i%10;
                reverseNumber = reverseNumber*10 + remainder;

            }

        System.out.println("Reverse number of " + b  + " is " + reverseNumber);


    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        reversingNumber(a);
    }
}
