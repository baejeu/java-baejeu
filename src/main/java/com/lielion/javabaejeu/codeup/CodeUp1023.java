package com.lielion.javabaejeu.codeup;

/*
실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.

 */

import java.util.*;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] value2 = new String[3]; //string 선언 방법
        value2[0] = "abcdef.asd";

        String[] value3 = value2[0].split("[.]");  //https://java119.tistory.com/106 char -> String 변환 방법
        char c = value3[0].charAt(0); // a
        char d = value3[1].charAt(1); // s
        System.out.println(c);
        System.out.println(d);

        String[] value4 = value2[0].split("[.]");
        char[] arr = value4[0].toCharArray();  // "abcdef"
        char[] arr2 = value4[1].toCharArray(); // "asd"

        for (char e: arr) {
            System.out.printf("%c", e);;
        }
        System.out.println();
        for (char f : arr2) {
            System.out.printf("%c", f);
        }
        System.out.println();




        String[] value = sc.next().split("[.]");
        int a = Integer.parseInt(value[0]);
        int b = Integer.parseInt(value[1]);

        System.out.printf("%d\n%d", a, b);

    }


}

/*
split?
 */
