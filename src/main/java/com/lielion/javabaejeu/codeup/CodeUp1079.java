package com.lielion.javabaejeu.codeup;
/*
[기초-종합] 원하는 문자가 입력될 때까지 반복 출력하기
입력 x b k d l q g a c
출력 x
    b
    k
    d
    l
    q
 */

import java.util.Scanner;
public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            char input = sc.next().charAt(0);
            System.out.println(input);
            if (input == 'q') {
                break;
            }
        }
    }
}