package com.lielion.javabaejeu.codeup;
/*
[기초-종합] 16진수 구구단?
A, B, C, D, E, F 중 하나가 입력될 때,
1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.
(단, A ~ F 까지만 입력된다.)
 */

import java.util.Scanner;
public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int sum;
        int last = 16;
        String hex = Integer.toHexString(last);
        hex = Integer.toString(last, 16);

        int input16 = Integer.valueOf(input, 16);  // String -> 16진수
        for (int i = 1; i < last ; i++) {
            sum = 1; // sum 초기화
            sum = input16 * i;
            System.out.printf("%X*%X=%X\n",input16,i,sum); // 16진수 출력 %X
        }

    }
}
