package com.lielion.javabaejeu.codeup;

/*
1010번
정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후
변수에 저장되어 있는 값을 그대로 출력해보자.
입력이라고 설명해야지 ㅡㅡ

 */

import java.util.Scanner; // Scanner 사용하기 위한 import문
public class CodeUp1010 {
    public static void main(String[] args) {
        int store; // 정수 저장 변수 선언
        Scanner sc = new Scanner(System.in); // 스캐너 클레스 sc 객체 생성
        store = sc.nextInt(); // store 변수에 저장
        System.out.println(store);
    }
}
