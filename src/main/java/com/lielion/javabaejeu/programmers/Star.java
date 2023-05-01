package com.lielion.javabaejeu.programmers;

import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        Solution.starPrint(input1, input2);

    }

    class Solution {
        static void starPrint (int a, int b){

            for (int i = 0; i < b; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }


    }
}
