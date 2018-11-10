package com.lwy.varios;

import java.util.Scanner;

/**
 *
 * @author LWY
 */
public class MainComparable {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        
        try {
            String s = String.valueOf(n);
            System.out.println("Good Job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }        
    }
}
