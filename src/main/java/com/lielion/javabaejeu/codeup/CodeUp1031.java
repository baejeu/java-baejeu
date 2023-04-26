package com.lielion.javabaejeu.codeup;
/*
10진수를 입력받아 8진수(octal)로 출력해보자.

참고
%d(10진수 형태)로 입력받고,
%o를 사용해 출력하면 8진수(octal)로 출력된다.

 */

import java.util.Scanner;
public class CodeUp1031 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();  // 10진수 입력받고 저장
        System.out.printf("%o", input);

    }
}
