package com.lielion.javabaejeu.codeup;
/*
[기초-반복실행구조] 0 입력될 때까지 무한 출력하기2
입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다.
(0은 출력하지 않는다.)
 */


import java.util.*;

public class CodeUp1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (true) {
                int input = sc.nextInt();
                if(input==0){
                    break;
                }
                System.out.println(input);


        }
    }
}