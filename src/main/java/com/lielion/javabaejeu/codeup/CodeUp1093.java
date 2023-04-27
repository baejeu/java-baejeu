package com.lielion.javabaejeu.codeup;
/*
선생님은 출석부를 보고 번호를 부르는데,
학생들의 얼굴과 이름을 빨리 익히기 위해 번호를 무작위(랜덤)으로 부른다.

그리고 얼굴과 이름이 잘 기억되지 않는 학생들은 번호를 여러 번 불러
이름과 얼굴을 빨리 익히려고 하는 것이다.

출석 번호를 n번 무작위로 불렀을 때, 각 번호(1 ~ 23)가 불린 횟수를 각각 출력해보자.

 */

import java.util.*;
public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt(); // 출석 번호 부른 횟수
        int[] arr = new int[24]; // 0으로 초기화 배열값들

        for (int i = 0; i < number ; i++) {
            int num = sc.nextInt(); // 1~23 숫자
            arr[num-1] += 1;
        }

        for (int i = 0; i < 23 ; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
