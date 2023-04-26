package com.lielion.javabaejeu.codeup;

/*
[기초-논리연산] 참 거짓 바꾸기
1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
반대로 출력하는 프로그램을 작성해보자.
*/

import java.util.*;
public class CodeUp1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println( input == 1 ? 0 : 1 );

    }

}