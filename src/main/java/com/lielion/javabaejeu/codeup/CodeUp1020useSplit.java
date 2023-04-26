package com.lielion.javabaejeu.codeup;

import java.util.Scanner;
import java.util.Scanner;
public class CodeUp1020useSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SecurityNumber[] = sc.next().split("[-]"); //981212-1234567
        String SecurityNumberPront = SecurityNumber[0];
        String SecurityNumberBack = SecurityNumber[1];

        System.out.println(SecurityNumberPront + SecurityNumberBack );

    }
}
