package com.lielion.javabaejeu.codeup;

/*
년월일을 출력하는 방법은 나라마다, 형식마다 조금씩 다르다.

년월일(yyyy.mm.dd)를 입력받아,

일월년(dd-mm-yyyy)로 출력해보자.

 */


import java.util.Scanner;
public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("\\.");
        int year = Integer.parseInt(input[0]);
        int month = Integer.parseInt(input[1]);
        int day = Integer.parseInt(input[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year );

    }
}