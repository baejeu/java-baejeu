package com.lielion.javabaejeu.codeup;

/*
[기초-비교연산] 두 정수 입력받아 비교하기4
두 정수(a, b)를 입력받아 a와 b가 서로 다르면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
 */

import java.util.*;
public class CodeUp1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a != b ? 1 : 0);   // 삼항 연산자   조건 ? true면 출력 : false면 출력
    }

}