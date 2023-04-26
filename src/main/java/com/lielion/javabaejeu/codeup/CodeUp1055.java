package com.lielion.javabaejeu.codeup;
/*
[기초-논리연산] 하나라도 참이면 참 출력하기
두 개의 참(1) 또는 거짓(0)이 입력될 때,
하나라도 참이면 참을 출력하는 프로그램을 작성해보자.
 */

import java.util.*;
public class CodeUp1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        System.out.println( (input1 == 1 ) || ( input2 == 1) ? 1 : 0 );

    }

}