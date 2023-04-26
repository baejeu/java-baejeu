package com.lielion.javabaejeu.codeup;
/*

정수 3개를 입력받아 합과 평균을 출력해보자.
 */


import java.util.Scanner;
public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int sum = input1 + input2 + input3;
        System.out.println(input1 + input2 + input3);
        System.out.printf("%.1f", sum/(float)3);
    }


}
