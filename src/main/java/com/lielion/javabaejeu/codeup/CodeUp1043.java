package com.lielion.javabaejeu.codeup;
/*
정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자.
단, 0 <= a, b <= +2147483647, b는 0이 아니다.

 */

import java.util.Scanner;
public class CodeUp1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        System.out.println(input1 % input2);
    }


}
