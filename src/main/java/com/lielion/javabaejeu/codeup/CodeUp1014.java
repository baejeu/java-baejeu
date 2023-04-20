package com.lielion.javabaejeu.codeup;

/*
1014번
2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.

 */

import java.util.Scanner;
public class CodeUp1014 {
    public static void main(String[] args) {
        char c1, c2; // c1 첫번째 아스키코드 문자 c2 두번째 아스키코드 문자
        Scanner sc = new Scanner(System.in);
        c1 = sc.next().charAt(0);
        c2 = sc.next().charAt(0);

        System.out.printf("%c %c", c2, c1); // 순서 바꾸기



    }
}
