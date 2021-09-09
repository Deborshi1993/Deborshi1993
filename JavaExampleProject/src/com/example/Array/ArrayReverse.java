package com.example.Array;

public class ArrayReverse {
    public static void main(String[] args) {
//declaration and instantiation of an array
        int[] arr = new int[5];
//initializing elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
//traversing over array using for loop
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            int pos = arr.length - 1 - i;
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        //length is the property of the array
        for (int j : arr) System.out.print(j + " ");
    }
}
