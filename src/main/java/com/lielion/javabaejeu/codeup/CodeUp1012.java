package com.lielion.javabaejeu.codeup;

/*
1012번
실수를 1개 받아서 출력 해보기
 */

import java.util.Scanner;
public class CodeUp1012 {
    public static void main(String[] args) {
        float floatstore; // 실수 저장 변수 생성
        Scanner sc = new Scanner(System.in);
        floatstore = sc.nextFloat(); // 실수 입력 받아서 float store에 저장
         // System.out.println(floatstore); 이렇게 하면 소수점 첫번째 자리까지만 출력
        System.out.printf("%f", floatstore); // 소수점 6자리 까지 정확하게 출력

    }
}
