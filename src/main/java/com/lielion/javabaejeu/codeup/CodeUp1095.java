package com.lielion.javabaejeu.codeup;
/*
 [기초-1차원배열] 이상한 출석 번호 부르기3
    번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
    n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.

    출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.
 */

import java.util.*;
public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[]arr = new int[number];

        for (int i = 0; i < number ; i++) {  // 배열에 숫자 넣는 코드
            int num = sc.nextInt();
            arr[i] = num;

        }
        int min = arr[0];
        int temp; // 배열 값 임시 저장 변수
        for (int i = 0; i < number; i++) {   // min 찾는 코드
             temp = arr[i];
             if( min > temp){
                 min = temp;
             }
        }
        System.out.println(min);



        /*   테스트 코드
                10
                10 4 2 3 6 6 7 9 8 5

              출력: 2
         */

    }
}
