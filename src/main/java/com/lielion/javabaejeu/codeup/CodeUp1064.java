package com.lielion.javabaejeu.codeup;
/*
[기초-삼항연산] 정수 3개 입력받아 가장 작은 수 출력하기
 */
import java.util.*;
public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println( (a > b ? b : a) > c ? c :(a > b ? b : a)); // 3항 연산자 사용하기 왜지?

    }

}