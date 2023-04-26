package com.lielion.javabaejeu.codeup;

/*
10진수를 입력받아 16진수(hexadecimal)로 출력해보자.

참고
%d(10진수 형태)로 입력받고
%X로 출력하면 16진수(hexadecimal) 대문자로 출력된다.

 */
import java.util.Scanner;
public class CodeUp1033 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();  // 10진수 입력받고 저장
        System.out.printf("%X", input);  // %x는 16진수 소문자 출력 %X는 16진수 대문자 출력

    }
}