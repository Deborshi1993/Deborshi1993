package com.example.Basics;

import java.util.Scanner;

public class PetersonNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Number must be a positive integer!");
            return;
        }
        int temp = num;
        while (temp != 0) {
            int remainder = temp % 10;
            int factorial = 1;
            temp = temp / 10;
            if (remainder > 1) {
                for (int i = remainder; i > 1; i--) {
                    factorial = factorial * i;
                }
                sum+= factorial;
            } else
                ++sum;
        }
        System.out.println("Input = " + num);
        System.out.println("Sum of individual numbers = " + sum);
        if (num == sum)
            System.out.println("Hence Number is Peterson Number");
        else
            System.out.println("Number is not Peterson Number");
    }
}
