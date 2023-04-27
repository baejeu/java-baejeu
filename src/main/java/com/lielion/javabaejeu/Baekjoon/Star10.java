package com.lielion.javabaejeu.Baekjoon;
/*
재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.
크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.
골드5!

N = 3                                                                     N = 27이면
***         배열로 푸는게 가능할까?                                         9*9 짜리 공백
* *          3 이면 [1][1] 공백
***

N = 9
*********     1.가운데 3*3 공백                  2. 가운데
* ** ** *   [1][1]  [1][4]   [1][7]       [3][3] [3][4] [3][5]           [9][9] [9][10] [9][11] [9][12] [9][13] [9][14] [9][15] [9][16] [9][17]
*********
***   ***   [4][1]           [4][7]       [4][3] [4][4] [4][5]           [10][9] ...
* *   * *
***   ***   [7][1]  [7][4]   [7][7]       [5][3] [5][4] [5][5]           ....
*********
* ** ** *
*********

int[][] arr = new int [9][9];

1. for문
for ( int i = 0;  i < 9 ; i++) {
    for (int j =0; j < 9 ; j++) {

        if ( i == (N%3==1 )

*/
// 절대로 블로그 코드 보지 않기
import java.util.*;
public class Star10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int[][] box = new int[input][input];

        // 1.for문 해결
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (i%3==1) {
                    if (j%3==1) {
                        box[i][j] = 1;
                    }
                }
            }
        }
        // 2.for문
        for (int i = input/3; i < (input/3)*2; i++){
            for (int j = input/3; j < (input/3)*2; j++){
                box[i][j] = 1;
            }
        }

        // 3. 별 출력문

        for (int i = 0; i < input ; i++) {
            for (int j = 0; j < input; j++) {
                if (box[i][j]==1){
                    System.out.print(" ");
                }
                else System.out.print("*");

            }
            System.out.println();
        }



        // System.out.println(Arrays.deepToString(box));

    }
}