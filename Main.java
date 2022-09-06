package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.print("Swapping :"+" "+"a = " +a +", b = " +b);
    }
}
