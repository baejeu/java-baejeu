package com.lielion.javabaejeu.Baekjoon;


import java.util.ArrayList;
import java.util.Scanner;

public class Q2167Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int RowSize = sc.nextInt(); // 배열의 행 수
        int ColumnSize = sc.nextInt(); // 배열의 열 수

        int[][] arr = new int[RowSize][ColumnSize]; // 2차원 배열 생성  첫째 줄 해결 완료

        // 2차원 배열 입력 받기
        for (int i = 0; i < RowSize; i++) {
            for (int j = 0; j < ColumnSize; j++) {
                arr[i][j] = sc.nextInt();     // 값 넣기
            }
        }

        // 2차원 배열의 원소들을 저장하는 ArrayList 생성
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < RowSize; i++) {
            for (int j = 0; j < ColumnSize; j++) {
                list.add(arr[i][j]);
            }
        }
         // System.out.println(list);  리스트 출력 확인
        int k = sc.nextInt(); // 합을 구할 부분의 개수 k

        //
        for (int cnt = 0; cnt < k; cnt++) {
            int i = sc.nextInt(); // 인덱스 값에 맞추기
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum = 0;
            int start = i*j-1; // 2 ~5 2~5
            int end = x*y-1;
            for (int cnt1 = start; cnt1 <= end ; cnt1++) {
                sum = sum + list.get(cnt1);
            }

            System.out.println(sum);
        }

        sc.close();
    }
}

