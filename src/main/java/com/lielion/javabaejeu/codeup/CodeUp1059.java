package com.lielion.javabaejeu.codeup;
/*
[기초-비트단위논리연산] 비트단위로 NOT 하여 출력하기
입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.
비트단위(bitwise)연산자 ~ 를 붙이면 된다.(~ : tilde, 틸드라고 읽는다.)
 */

import java.util.*;
public class CodeUp1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.printf("%d", ~input);  // 1 입력시 -2 출력

    }
}

/*  1을 32비트 2진수 표현
 1 : 00000000 00000000 00000000 000000001       ~(bitwise not)
-2 : 11111111 11111111 11111111 111111110

 */
/*
 비트단위(bitwise) 연산자는
~(bitwise not), &(bitwise and), |(bitwise or), ^(bitwise xor),
<<(bitwise left shift), >>(bitwise right shift)



 */