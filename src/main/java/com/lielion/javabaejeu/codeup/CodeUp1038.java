package com.lielion.javabaejeu.codeup;

/*
정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
(단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)

 */
import java.util.Scanner;
public class CodeUp1038 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long input1 = sc.nextInt();
        long input2 = sc.nextInt();
        long sum = input1 + input2;
        System.out.printf("%d", sum);

    }
}
