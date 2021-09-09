package com.example.SmartInterviews;

import java.util.*;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of iterations: ");
        int iterations = sc.nextInt();
        if (iterations < 1 || iterations > 100) {
            System.out.println("Number must be in 1 <= T <= 100");
            return;
        }

        System.out.println("Enter " + iterations + " times odd numbers: ");
        int[] arr = new int[iterations];
        int i;
        for (i = 0; i < iterations; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < iterations; i++) {
            System.out.println("Case #" + (i+1) + ":");
            //Start of main diamond print logic
            int mid = arr[i] / 2 + 1;
            int j;
            for (j = 0; j < mid; j++) {
                for (int k = 1; k <= arr[i]; k++) {
                    if (k == mid - j || k == mid + j)
                        System.out.print("&");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
            for (j = mid - 2; j >= 0; j--) {
                for (int k = 1; k <= arr[i]; k++) {
                    if (k == mid - j || k == mid + j)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}




