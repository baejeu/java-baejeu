package com.lielion.javabaejeu.codeup;

/*
입력되는 시:분:초 에서 분만 출력해보자.
17:23:57
 */

import java.util.Scanner;
public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] input = sc.next().split(":");
        int min = Integer.parseInt(input[1]);
        System.out.printf("%d", min);


    }
}