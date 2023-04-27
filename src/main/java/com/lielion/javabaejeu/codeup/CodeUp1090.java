package com.lielion.javabaejeu.codeup;
/*등비수열
시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
공백을 두고 입력된다.(모두 0 ~ 10)

*/

import java.util.*;
public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long r = sc.nextInt();
        long n = sc.nextInt();

        long output = a * r;

        for (int i = 1; i < n-1 ; i++) {
            output *= r;
        }
        System.out.println(output);
    }
}