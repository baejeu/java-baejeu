package com.lielion.javabaejeu.codeup;

import java.util.*;

public class Q1367 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input =sc.nextInt();


        for (int i = 0; i < input; i++) {

            for (int j = input; j-i-1 > 0 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < input ; k++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
