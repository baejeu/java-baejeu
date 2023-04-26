package com.lielion.javabaejeu.codeup;
/*
[기초-삼항연산] 두 정수 입력받아 큰 수 출력하기
입력된 두 정수 a, b 중 큰 값을 출력하는 프로그램을 작성해보자.
단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
 */

import java.util.*;
public class CodeUp1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b ? a : b);

    }
}