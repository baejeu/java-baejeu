package com.lielion.javabaejeu.codeup;

import java.util.*;

public class Q1361 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < input ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 1; k++) {
                System.out.print("**");
            }
            System.out.println();

        }


    }
}
