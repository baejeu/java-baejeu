package com.lielion.javabaejeu.codeup;
/*
[기초-반복실행구조] 정수 1개 입력받아 그 수까지 출력하기
정수 1개가 입력된다.
(0 ~ 100)
입력 4
    0
    1
    2
    3
    4

 */
import java.util.Scanner;
public class CodeUp1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input+1];       // 4  [0, 1, 2, 3, 4]
        int input2 = input;
        for (int i = 0; i <= input2 ; i++) { // 4
            arr[input] = input;
            input--;
        }
        for (int i = 0; i <= input2 ; i++) {
            System.out.println(arr[i]);
        }
    }
}
