package com.bridgelabz;

import java.util.Scanner;

public class OperatorPrblm2 {

    static boolean checkMonthAndDate(int a , int b){
        int sum = 59;
        
        if (a == 3){
            sum = sum + b;
            if (sum > 78 && sum < 90){
                return true;
            }
        } else if (a == 4) {
            sum = sum + 31 + b;
            if (sum > 90 && sum < 120){
                return true;
            }
        } else if (a == 5) {
            sum = sum + 31 + 30 + b;
            if (sum > 120 && sum < 151){
                return true;
            }
        } else if ( a == 6) {
            sum = sum + 31 + 30 + 31 + b;
            if (sum > 151 && sum < 172){
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month number : ");
        int m = input.nextInt();
        System.out.println("Enter a date : ");
        int d = input.nextInt();
        boolean check = checkMonthAndDate(m,d);
        System.out.println(check);




    }
}
