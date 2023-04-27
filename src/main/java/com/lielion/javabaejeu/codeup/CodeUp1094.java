package com.lielion.javabaejeu.codeup;
/*
 [기초-1차원배열] 이상한 출석 번호 부르기2
 학생들의 얼굴과 이름을 빨리 익히기 위해 번호를 무작위(랜덤)으로 부르는데,
 영일이는 선생님이 부른 번호들을 기억하고 있다가 거꾸로 불러보는 것을 해보고 싶어졌다.

출석 번호를 n번 무작위로 불렀을 때, 부른 번호를 거꾸로 출력해 보자.
 */

import java.util.*;
public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[]arr = new int[number];

        for (int i = 0; i < number ; i++) {
            int num = sc.nextInt();
            arr[i] = num;

        }
        int downPrint = number - 1;
        for (int i = 0; i < number ; i++) {
            System.out.printf("%d ", arr[downPrint]);
            downPrint--;
        }
        /*   테스트 코드
                10
                10 4 2 3 6 6 7 9 8 5

         */

    }
}
