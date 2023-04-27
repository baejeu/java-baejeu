package com.lielion.javabaejeu.codeup;
/*
[기초-2차원배열] 설탕과자 뽑기
첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,              배열크기 ( h, w)
두 번째 줄에 놓을 수 있는 막대의 개수(n)
세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.


모든 막대를 놓은 격자판의 상태를 출력한다.
막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다.
단, 각 숫자는 공백으로 구분하여 출력한다.

입력 예시
5 5
3
2 0 1 1  l ,d ,x ,y
3 1 2 3
4 1 2 5

 */

import java.util.*;
public class CodeUp1098 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();  // 막대의 개수

        int[][] SugarBox = new int[h][w];   // 설탕 박스 배열

        for (int i = 0; i < n; i++) { // 막대의 개수 만큼 반복하기
            int l = sc.nextInt(); // 막대의 길이
            int d = sc.nextInt();  // 방향         0~1  0: 가로 방향 1: 세로 방향
            int x = sc.nextInt();  // x좌표        막대 시작 좌표
            int y = sc.nextInt();  // y좌표

            if (d == 0) {  // 막대 방향 가로
                for (int j = 0; j < l; j++) {  // 막대길이 만큼 반복
                    SugarBox[x-1][y-1] = 1;
                    y++;
                }

            } else if (d == 1) { // 막대 방향 세로
                for (int j = 0; j < l; j++) {  // 막대길이 만큼 반복
                    SugarBox[x-1][y-1] = 1;
                    x++;
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.printf("%d ", SugarBox[i][j]);
            }
            System.out.println();
        }
    }
}