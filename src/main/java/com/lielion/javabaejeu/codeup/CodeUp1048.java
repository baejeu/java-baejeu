package com.lielion.javabaejeu.codeup;

/*
[기초-비트시프트연산] 한 번에 2의 거듭제곱 배로 출력하기
예를 들어 1 3 이 입력되면 1을 2의3승(8)배 하여 출력한다.
 */
import java.util.*;
public class CodeUp1048 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int PowerOf2 = 1;

        for (int i = 1; i <= input2 ; i++) {
            PowerOf2 = 2 * PowerOf2;
        }
        System.out.printf("%d", input1 * PowerOf2);

    }
}
