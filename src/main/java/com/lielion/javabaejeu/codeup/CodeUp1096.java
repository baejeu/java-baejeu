package com.lielion.javabaejeu.codeup;

/*
[기초-2차원배열] 바둑판에 흰 돌 놓기
바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.
 */

import java.util.*;

public class CodeUp1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // n개의 흰 돌

        int[][] Arr2 = new int[19][19]; // 19*19 바둑판 default : 0

        int[] arrXandY = new int[2]; // 바둑판 x, y 좌표 받는 배열

        for (int i = 0; i < number; i++) {
            arrXandY[0]= sc.nextInt(); // x좌표
            arrXandY[1]= sc.nextInt(); // y좌표

            Arr2[arrXandY[0]-1][arrXandY[1]-1] = 1; // 바둑판에 돌 올리기
        }
        for (int i = 0; i < 19 ; i++) {
            for (int j = 0; j < 19 ; j++) {
                System.out.printf("%d ", Arr2[i][j]);
            }
            System.out.println();
        }
    }
}
