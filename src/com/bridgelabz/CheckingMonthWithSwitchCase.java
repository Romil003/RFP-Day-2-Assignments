package com.bridgelabz;

import java.util.Scanner;

public class CheckingMonthWithSwitchCase {

    static void checkMonth(int a){
        switch (a) {
            case 1 -> System.out.println(a + " is a January");
            case 2 -> System.out.println(a + " is a February");
            case 3 -> System.out.println(a + " is a March");
            case 4 -> System.out.println(a + " is a April");
            case 5 -> System.out.println(a + " is a May");
            case 6 -> System.out.println(a + " is a June");
            case 7 -> System.out.println(a + " is a July");
            case 8 -> System.out.println(a + " is a August");
            case 9 -> System.out.println(a + " is a September");
            case 10 -> System.out.println(a + " is a October");
            case 11 -> System.out.println(a + " is a November");
            case 12 -> System.out.println(a + " is a December");
            default -> System.out.println(a + " is Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        checkMonth(number);
    }
}
