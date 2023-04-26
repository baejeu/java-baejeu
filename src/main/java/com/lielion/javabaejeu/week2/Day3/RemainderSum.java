package com.lielion.javabaejeu.week2.Day3;

import java.util.Scanner;
// 각 자릿수? 합 구하기
public class RemainderSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;

        while (number>0) {
            int remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
            /*
            if (number<0){
                break;
            }
            */
        }
        System.out.println(sum);

        /*
        int num = 687;
        int a = num % 10;
        num = num / 10;
        int b = num % 10;
        num = num / 10;
        int c = num % 10;
        System.out.println(a + b + c);

         */
    }
}
