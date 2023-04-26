package com.lielion.javabaejeu.codeup;

/*
 [기초-종합] 짝수 합 구하기
 1부터 입력된 수까지 짝수의 합을 출력한다.
 입력 5 출력 6 = 2+4
 */

import java.util.Scanner;
public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int num = 1;
        int sum = 0;

        for (int i = 1; i <= input; i++) {
            if (num % 2 == 0) {
                sum += num;
            }
            num++;
        }
        System.out.println(sum);
    }
}


        /*     codeup 에서 시간 초과가 뜬다 인텔리제이에서는 정상 작동
        while(true){
            if(num % 2==0){
                sum += num;
            }
            if(num == input){
                break;
            }
            num ++;
        }
        System.out.println(sum);
        */

