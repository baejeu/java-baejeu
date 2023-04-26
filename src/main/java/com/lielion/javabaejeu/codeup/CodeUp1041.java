package com.lielion.javabaejeu.codeup;
/*

영문자 1개를 입력받아 그 다음 문자를 출력해보자.

영문자 'A'의 다음 문자는 'B'이고, 영문자 '0'의 다음 문자는 '1'이다.
 */

import  java.util.Scanner;
public class CodeUp1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char inputchar = input.charAt(0);
        int inputInt = (int)inputchar;
        int inputIntNext = inputInt + 1;
        char output = (char)inputIntNext;
        System.out.printf("%c", output);

    }
}
