package com.lielion.javabaejeu.codeup;
/*
[기초-조건/선택실행구조] 평가 입력받아 다르게 출력하기
평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
평가 : 내용
A : best!!!
B : good!!
C : run!
D : slowly~
나머지 문자들 : what?
 */

import java.util.*;
public class CodeUp1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

        switch (input){
            case 'A' :
                System.out.println("best!!!");
                break;

            case 'B' :
                System.out.println("good!!");
                break;

            case 'C' :
                System.out.println("run!");
                break;

            case 'D' :
                System.out.println("slowly~");
                break;

            default:
                System.out.println("what?");

        }

    }

}