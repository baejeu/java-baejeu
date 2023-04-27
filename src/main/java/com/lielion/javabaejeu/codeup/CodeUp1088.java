package com.lielion.javabaejeu.codeup;
/*
[기초-종합] 3의 배수는 통과?
1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
3의 배수인 경우는 출력하지 않도록 만들어보자.
 */

import java.util.*;

public class CodeUp1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        long sum = 0;
        long cnt = 1;
        while (true) {
            System.out.printf("%d ", cnt);
            if (cnt == input){
                break;
            }
            cnt++;
            if (cnt % 3 == 0) {
                cnt++;
            }
        }
    }
}
