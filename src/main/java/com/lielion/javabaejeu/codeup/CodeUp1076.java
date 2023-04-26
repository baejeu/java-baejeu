package com.lielion.javabaejeu.codeup;
/*
[기초-반복실행구조] 문자 1개 입력받아 알파벳 출력하기
입력 f
출력 a b c d e f
*/

import java.util.*;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        int num = (int)input - 96;  // 아스키 코드 a = 97   num = 문자 개수   + A = 65
        // System.out.println(num); // 배열 크기  ex) f = a,b,c,d,e,f
        char [] arr = new char[num];
        int num2 = num;
        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i < num2 ; i++) {
            arr[num-1] = (char)input;
            num = num -1;
            input --;
        }
        // System.out.println(Arrays.toString(arr)); // 배열 출력
        for (int i = 0; i < num2; i++) {
            System.out.printf("%c ", arr[i]);;
        }
        }
    }

