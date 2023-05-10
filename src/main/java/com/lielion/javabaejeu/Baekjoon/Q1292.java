package com.lielion.javabaejeu.Baekjoon;


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

// 1 2 2 3 3 3 4 4 4 4 5 .. 수열  어느 일정한 구간을 주면 그 구간의 합
/*
 A, B(1 ≤ A ≤ B ≤ 1,000)

1. A ~ B 구간 전체 수열 배열에 넣는 방법
2. 1+2+3+4+5+...1000?

 */
public class Q1292 {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer>list = new ArrayList<>();
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                list.add(i);
                if (list.size()>=1000) break;  // 여기서 break 문은 j = 0 for문만 break 한다!!!!!!
            }
            if (list.size()>=1000) break;
        }
        // System.out.println(list);


        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        br.close();

        int sum = 0;
        for (int i = A; i <= B; i++) { // A = 1   B = 10
            sum =  sum + list.get(i-1);
        }
        System.out.println(sum);
    }
}
