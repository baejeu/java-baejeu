package com.lielion.javabaejeu.codeup;
/*
 [기초-비교연산] 두 정수 입력받아 비교하기3
 두 정수(a, b)를 입력받아
 b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력하는 프로그램을 작성해보자.
*/

import java.util.*;
public class CodeUp1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a <= b ? 1 : 0);   // 삼항 연산자   조건 ? true면 출력 : false면 출력
    }

}
