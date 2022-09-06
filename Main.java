package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = scan.nextInt();
        int arr[] = new int[size];
        int i = 0, j = 0, k = 0;
        System.out.println("Enter the elements to the array");
        for (i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if ((arr[i] ^ arr[j]) == 0) {
                    for (k = j; k < size - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    j--;
                    size--;
                }
            }
        }

        System.out.println("The new array");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
