package com.lielion.javabaejeu.codeup;

/*
입력된 정수의 부호를 바꿔 출력해보자.
 */

import java.util.*;
public class CodeUp1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long input = sc.nextLong();
        Long inputchange = 0 - input;
        System.out.printf("%d", inputchange);

    }
}
