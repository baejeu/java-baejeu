package com.lielion.javabaejeu.codeup;

/*
실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.

 */

import java.util.*;
public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] value = sc.next().split("[.]");
        int a = Integer.parseInt(value[0]);
        int b = Integer.parseInt(value[1]);

        System.out.printf("%d\n%d", a, b);

    }


}

/*
split?
 */
