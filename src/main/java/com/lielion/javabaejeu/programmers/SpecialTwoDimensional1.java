package com.lielion.javabaejeu.programmers;

public class SpecialTwoDimensional1 {
    public static void main(String[] args) {

    }
    /*
3	[[1, 0, 0], [0, 1, 0], [0, 0, 1]]
6	[[1, 0, 0, 0, 0, 0], [0, 1, 0, 0, 0, 0], [0, 0, 1, 0, 0, 0], [0, 0, 0, 1, 0, 0], [0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 0, 1]]
1	[[1]]
     */
    class Solution {
        public int[][] solution(int n) {
            int[][] answer = new int[n][n];

            for (int i = 0; i <n ; i++) {
                answer[i][i] = 1;
            }


            return answer;
        }
    }
}
