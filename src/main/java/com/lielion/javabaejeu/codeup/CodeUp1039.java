package com.lielion.javabaejeu.codeup;

/*
정수 2개를 입력받아 합을 출력해보자.
단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.

2개의 정수가 공백으로 구분되어 입력된다.
 */

import java.util.*;
public class CodeUp1039 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long input1 = sc.nextLong();
        long input2 = sc.nextLong();

        System.out.printf("%d", input1 + input2);

    }
}
