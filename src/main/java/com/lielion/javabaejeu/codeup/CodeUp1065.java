package com.lielion.javabaejeu.codeup;
/*
[기초-조건/선택실행구조] 정수 3개 입력받아 짝수만 출력하기
세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
 */
import java.util.*;
public class CodeUp1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int [] intArray = new int[] { a, b , c};
        // 짝수 체크
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2==0 ){
                System.out.println(intArray[i]);
            }
        }
    }

}