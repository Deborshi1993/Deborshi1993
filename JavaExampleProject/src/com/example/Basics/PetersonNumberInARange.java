package com.example.Basics;

import java.util.Scanner;

public class PetersonNumberInARange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer as upper-limit: ");
        int limit = sc.nextInt();
        if (limit <= 0) {
            System.out.println("Number must be a positive integer!");
            return;
        }

        while (limit > 1) {
            int sum = 0;
            int temp = limit;
            while (temp != 0) {
                int remainder = temp % 10;
                int factorial = 1;
                temp = temp / 10;
                if (remainder > 1) {
                    for (int i = remainder; i > 1; i--) {
                        factorial = factorial * i;
                    }
                    sum = sum + factorial;
                } else
                    ++sum;
            }
            if (sum == limit)
                System.out.println("Peterson Number : " + limit);

            --limit;
        }
    }
}
