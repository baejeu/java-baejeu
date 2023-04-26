package com.lielion.javabaejeu.codeup;

/*
[기초-반복실행구조] 정수 1개 입력받아 카운트다운 출력하기1
정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
 */
import java.util.*;

public class CodeUp1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (true) {
            System.out.println(input);
            input --;
            if(input==0){
                break;
            }

        }
    }
}
