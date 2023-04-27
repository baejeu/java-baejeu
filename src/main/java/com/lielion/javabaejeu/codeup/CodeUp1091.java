package com.lielion.javabaejeu.codeup;
/*

1 -1 3 -5 11 -21 43 ... 은
1부터 시작해 이전에 만든 수에 -2를 곱한 다음 1을 더해 다음 수를 만든 수열이다.

이런 이상한 수열을 알게 된 영일이는 또 궁금해졌다.

"그럼.... 13번째 나오는 수는 뭘까?"

시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때,
n번째 수를 출력하는 프로그램을 만들어보자.
 */
import java.util.*;
public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long m = sc.nextInt();
        long d = sc.nextInt();
        long n = sc.nextInt();

        long output = a;

        for (int i = 1; i < n ; i++) {
            output = ( output * m ) + d;
        }
        System.out.println(output);


    }
}