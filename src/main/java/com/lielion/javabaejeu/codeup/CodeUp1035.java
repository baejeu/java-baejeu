package com.lielion.javabaejeu.codeup;

/*
16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.

참고
%x(영문자 소문자) 나 %X(영문자 대문자)로 입력 받으면
16진수로 인식시켜 저장시킬 수 있다. %o로 출력하면 8진수로 출력된다.

 */
import java.util.Scanner;
public class CodeUp1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.next(), 16); // 16진수 입력받기
        System.out.printf("%o\n", num); // 8진수로 출력

        int num2 = Integer.valueOf((sc.next()), 2); // 2진수
        System.out.printf("%d", num2);

    }
}
