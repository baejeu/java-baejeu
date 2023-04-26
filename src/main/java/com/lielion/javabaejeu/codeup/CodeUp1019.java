package com.lielion.javabaejeu.codeup;

/*
1019번
년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.

 */

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input[]= sc.next().split("\\.");
        int year = Integer.parseInt(input[0]);
        int month = Integer.parseInt(input[1]);
        int day = Integer.parseInt(input[2]);

        System.out.printf("%4d.%02d.%02d", year, month, day); // %03d 는 3칸 출력인데 출력x시 0으로 채운다.

    }
}

/*
2023년 04월 21일 1회차 String 으로 문제 풀기
+ Split 으로 다시 한번 풀어보기
 */