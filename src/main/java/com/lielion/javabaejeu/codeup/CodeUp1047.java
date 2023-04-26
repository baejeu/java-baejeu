package com.lielion.javabaejeu.codeup;

/*
[기초-비트시프트연산] 정수 1개 입력받아 2배 곱해 출력하기
정수 1개를 입력받아 2배 곱해 출력해보자.
 */

import java.util.Scanner;
public class CodeUp1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input<<1);  // shift left <<1 이면 *2   right >>1 이면 /2

    }

}

/*
x << y	정수 x의 각 비트를 y만큼 왼쪽으로 이동시킵니다. (빈자리는 0으로 채워집니다.)
x >> y	정수 x의 각 비트를 y만큼 오른쪽으로 이동시킵니다. (빈자리는 정수 a의 최상위 부호비트와 같은 값으로 채워집니다.
          피연산자의 비트열을 오른쪽으로 이동시키며, 이동에 따른 빈공간은 음수의경우엔 1, 양수의 경우엔 0으로 채움.
x >>> y	정수 x의 각 비트를 y만큼 오른쪽으로 이동시킵니다. (빈자리는 0으로 채워집니다.)
 */