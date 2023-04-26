package com.lielion.javabaejeu.codeup;

/*
8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.

참고
%o로 입력받으면 8진수로 인식시켜 저장시킬 수 있다.
%d로 출력하면 10진수로 출력된다.

 */
import java.util.Scanner;
public class CodeUp1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.next(), 8); // 8진수 문자열로 입력 받기
        System.out.printf("%d", num); // 10진수로 출력

    }
}
