package com.bridgelabz;

import java.util.Scanner;

public class ReadNumber {

    static void readNumber(int a) {
        if (a == 1) {
            System.out.println("Unit");
        } else if (a == 10) {
            System.out.println("Ten");
        } else if (a == 100) {
            System.out.println("Hundred");
        } else if (a == 1000) {
            System.out.println("Thousand");
        }
        else {
            System.out.println("Invalid number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        readNumber(num);
    }
}
