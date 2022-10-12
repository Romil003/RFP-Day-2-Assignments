package com.bridgelabz;

public class OperatorPrblm4 {

    static void calculateDistance(int x , int y){
        double distance = Math.floor(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));
        System.out.println("Euclidean distance is " + distance);
    }

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        calculateDistance(num1,num2);
    }
}
