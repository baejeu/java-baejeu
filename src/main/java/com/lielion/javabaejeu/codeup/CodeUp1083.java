package com.lielion.javabaejeu.codeup;
/*
[기초-종합] 3 6 9 게임의 왕이 되자!
10 보다 작은 정수 1개가 입력된다.
(1 ~ 9)
1 부터 그 수까지 순서대로 공백을 두고 수를 출력하는데,
3 또는 6 또는 9인 경우 그 수 대신 영문 대문자 X 를 출력한다.
 */

import java.util.Scanner;

public class CodeUp1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            if (i%3==0){
                System.out.printf("%c ", 'X');
            }
            else {
                System.out.printf("%d ", i);
            }

        }


    }
}
