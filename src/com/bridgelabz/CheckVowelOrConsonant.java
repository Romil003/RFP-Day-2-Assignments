package com.bridgelabz;

import java.util.Scanner;

public class CheckVowelOrConsonant {
    static void checkVowel ( char ch ){
        switch (ch) {
            case 'a' , 'e' , 'o' , 'u' , 'i' -> System.out.println(ch + " is a vowel");
            case 'A' , 'E' , 'O' , 'U' , 'I' -> System.out.println(ch + " is a vowel");
            default -> System.out.println(ch + " is a consonant");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char character = input.next().charAt(0);
        checkVowel(character);
    }
}
