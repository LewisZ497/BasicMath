package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        /*
        System.out.println("What is your first number?");
        float firstNum = input.nextFloat();

        System.out.println("What is your second number");
        float secNum = input.nextFloat();
        float total = firstNum / secNum;

        System.out.println(total);

        System.out.println(17 % 5);
        if((17 % 5) == 0) {
            System.out.println("Number is divisible by 5");
        }

        System.out.println("Enter a number");
        int inputNum = input.nextInt();
        if((inputNum % 2) == 1) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is even");
        }

        System.out.println("Enter your first number");
        int firstNum = input.nextInt();

        System.out.println("Enter your second number");
        int secNum = input.nextInt();

        System.out.println(firstNum / secNum);
        System.out.println(firstNum % secNum);
        */
        int total = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            total += input.nextInt();
        }
        System.out.println(total + " / 5 = " + (float) total / 5);
    }
}
