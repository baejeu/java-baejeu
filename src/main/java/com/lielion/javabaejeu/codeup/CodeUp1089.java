package com.lielion.javabaejeu.codeup;
/*
 [기초-종합] 수 나열하기1
 시작 값(a), 등차의 값(d), 몇 번째 수 인지를 의미하는 정수(n)가
 공백을 두고 입력된다.(모두 0 ~ 100)

 */

import java.util.*;
public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int output = a + (b*(n-1));
        System.out.println(output);
    }
}
