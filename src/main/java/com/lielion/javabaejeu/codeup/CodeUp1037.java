package com.lielion.javabaejeu.codeup;

/*
10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
단, 0 ~ 255 범위의 정수만 입력된다.
 */

import java.util.Scanner;
public class CodeUp1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        char inputChar = (char)input;
        System.out.printf("%c", inputChar);
    }
}
