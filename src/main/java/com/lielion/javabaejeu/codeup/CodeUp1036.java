package com.lielion.javabaejeu.codeup;

/*
영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
 */
import java.util.Scanner;
public class CodeUp1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int input1 = (int)input.charAt(0);
        System.out.printf("%d", input1);


    }
}
