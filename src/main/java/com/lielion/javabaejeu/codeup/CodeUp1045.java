package com.lielion.javabaejeu.codeup;

/*
정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
 */
import java.util.Scanner;
public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input1 = sc.nextLong();
        long input2 = sc.nextLong();
        System.out.println(input1 + input2);
        System.out.println(input1 - input2);
        System.out.println(input1 * input2);
        System.out.println(input1 / input2);
        System.out.println(input1 % input2);
        System.out.printf("%.2f", input1 / (float)input2);
    }


}