package com.lielion.javabaejeu.codeup;


/*
[기초-비교연산] 두 정수 입력받아 비교하기2
a와 b의 값이 같은 경우 1을, 그렇지 않은 경우 0을 출력한다.
*/

import java.util.*;
public class CodeUp1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a == b ? 1 : 0);   // 삼항 연산자   조건 ? true면 출력 : false면 출력
    }

}