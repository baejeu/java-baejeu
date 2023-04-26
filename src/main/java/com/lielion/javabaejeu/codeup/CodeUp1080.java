package com.lielion.javabaejeu.codeup;
/*
[기초-종합] 언제까지 더해야 할까?

 */

import java.util.Scanner;
public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        int num = 1;
        while(true){
            sum = sum + num;
            if (sum>=input){
                break;
            }
            num++;
        }
        System.out.println(num);

    }
}
