package com.bridgelabz;

import java.util.Scanner;

public class OperatorPrblm1 {

    static void checkMaxAndMin(int num1 , int num2 , int num3){
         int result1 = num1+num2*num3;
         int result2 = num3+num1/num2;
         int result3 = num1%num2+num3;
         int result4 = num1*num2+num3;
        System.out.println("Result1 is " + result1);
        System.out.println("Result2 is " + result2);
        System.out.println("Result3 is " + result3);
        System.out.println("Result4 is " + result4);
         int max = 0 ;
         int min = 0 ;
         if (result1 > result2 && result1 > result3 && result1 > result4){
             max = result1;
             System.out.println("Max is " + max);
         } else if (result1 < result2 && result1 < result3 && result1 < result4) {
             min = result1;
             System.out.println("Min is " + min);
         }
         if (result2 > result1 && result2 > result3 && result2 > result4){
            max = result2;
            System.out.println("Max is " + max);
        } else if (result2 < result1 && result2 < result3 && result2 < result4) {
            min = result2;
             System.out.println("Min is " + min);
        }
         if (result3 > result1 && result3 > result2 && result3 > result4){
            max = result3;
             System.out.println("Max is " + max);
        } else if (result3 < result1 && result3 < result2 && result3 < result4) {
            min = result3;
             System.out.println("Min is " + min);
        }
         if (result4 > result1 && result4 > result2 && result4 > result3){
            max = result4;
             System.out.println("Max is " + max);
        } else if (result4 < result1 && result4 < result2 && result4 < result3) {
            min = result4;
             System.out.println("Min is " + min);
        }


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int number1 = input.nextInt();
        System.out.print("Enter 2nd number : ");
        int number2 = input.nextInt();
        System.out.print("Enter 3rd number : ");
        int number3 = input.nextInt();
        checkMaxAndMin(number1,number2,number3);

    }
}
