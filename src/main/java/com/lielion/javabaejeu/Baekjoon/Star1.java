package com.lielion.javabaejeu.Baekjoon;
/*

별찍기

*
**
***
****
*****

 */

import java.util.*;

public class Star1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.printf("%c", '*');
            }
            System.out.println();
        }


    }
}
