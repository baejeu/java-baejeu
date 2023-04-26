package com.lielion.javabaejeu.codeup;

/*
[기초-조건/선택실행구조] 월 입력받아 계절 출력하기
월을 의미하는 1개의 정수가 입력된다.(1 ~ 12)
12, 1, 2 : winter
3, 4, 5 : spring
6, 7, 8 : summer
9, 10, 11 : fall
 */

import java.util.Scanner;
public class CodeUp1070 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input==12 || input==1 || input==2){
            System.out.println("winter");
        }
        else if (input==3 || input==4 || input==5){
            System.out.println("spring");
        }
        else if (input==6 || input==7 || input==8){
            System.out.println("summer");
        }
        else if (input==9 || input==10 || input==11){
            System.out.println("fall");
        }


    }
}
