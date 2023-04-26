package com.lielion.javabaejeu.codeup;
/*
1072 : [기초-반복실행구조] 정수 입력받아 계속 출력하기

 */

import java.util.*;

public class CodeUp1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int [] arr = new int[input];

        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }



    }
}