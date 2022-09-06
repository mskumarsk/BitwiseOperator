package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number:");
        int no=scan.nextInt();
        System.out.println("Using '&' operator");
        int ans=no&1;
        if (ans==1) {
            System.out.println(no+" "+"Odd number.");
        }else {
            System.out.println(no+" "+"Evan number.");
        }
        System.out.println("Using '^' operator");
        if ((no^1)==no+1){
            System.out.println(no+" "+"Evan number.");
        }else {
            System.out.println(no+" "+"Odd number.");
        }
        System.out.println("Using '|' operator");
        if ((no|1)>no){
            System.out.println(no+" "+"Evan number.");
        }else {
            System.out.println(no+" "+"Odd number.");
        }
    }
}
