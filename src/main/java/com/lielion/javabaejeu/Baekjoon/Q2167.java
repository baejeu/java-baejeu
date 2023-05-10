package com.lielion.javabaejeu.Baekjoon;
/*
2차원 배열이 주어졌을 때 (i, j) 위치부터 (x, y) 위치까지에 저장되어 있는 수들의 합을 구하는 프로그램을 작성하시오. 배열의 (i, j) 위치는 i행 j열을 나타낸다.
2 3            // N,M 첫째 줄에는 배열의 크기 (1 ≤ N, M ≤ 300)
1 2 4          // 배열 입력 (1,1) (1,2) (1,3) ? (2,1) (2,2) (2,3) 실제 배열 index는 -1
8 16 32
3              // 합을 구할 부분의 개수
1 1 2 3        // (1,1)~(2,3)          전체+ = 31+32 = 63
1 2 1 2
1 3 2 3

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Q2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int RowSize = sc.nextInt(); // 행크기
        int ColumnSize = sc.nextInt(); // 열크기

        int [][] Array = new int[RowSize][ColumnSize]; // 2차원 배열 생성  첫째 줄 해결 완료
        for (int i = 0; i < RowSize ; i++) {
            for (int j = 0; j < ColumnSize ; j++) {
                Array[i][j] = sc.nextInt();            // 값 넣기
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int[] push : Array) {
            for (int element : push) {
                list.add(element);
            }
        }

        int k = sc.nextInt(); // 합을 구할 부분의 개수 k

        for (int cnt = 0; cnt < k ; cnt++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (j==y){
                int sum = printSum2(i, j, x, y, Array);
                System.out.println(sum);
            }
            else {
                int sum = printSum(i, j, x, y, list);
                System.out.println(sum);
            }
        }
    }

    public static int printSum(int i, int j, int x, int y, ArrayList<Integer> list ){
        int sum = 0;
        int start = i*j-1; // 2 ~5 2~5
        int end = x*y-1;
        for (int k = start; k <= end ; k++) {
            sum = sum + list.get(k);
        }
        return sum;
    }

    public static int printSum2(int i, int j, int x, int y, int[][] Array){
        int sum =0;

        for (int k = i; k <= x ; k++) {
            sum = sum + Array[k-1][j-1];
        }

        return sum;
    }
}


