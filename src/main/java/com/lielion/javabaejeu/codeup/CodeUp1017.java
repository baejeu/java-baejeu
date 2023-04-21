package com.lielion.javabaejeu.codeup;

/*
1017번

int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자.

 */

import java.util.Scanner;
public class CodeUp1017 {
    public static void main(String[] args) {
    int intInput;
    Scanner sc = new Scanner(System.in);
    intInput = sc.nextInt();
        System.out.printf("%d %d %d", intInput, intInput, intInput);

    }
}
