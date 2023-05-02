package com.lielion.javabaejeu.programmers;

import java.util.Arrays;

public class Queries4 {
    public static void main(String[] args) {
        System.out.println(0%1);

    }

    class Solution {
        public int[] solution(int[] arr, int[][] queries) {

            int[] compare = new int[arr.length];
            compare = arr;
            int[] answer =  new int[arr.length];
            answer = compare;
            for (int i = 0; i < queries.length ; i++) {
                int s = queries[i][0];         // 0
                int e = queries[i][1];         // 4
                int k = queries[i][2];         // 1
                for (int j= s ; j <= e; j++) { // 0~4
                    if(j%k==0){
                        answer[j]= answer[j]+1;
                    }
                }
            }
            return answer;
        }
    }


}
/*

i가 인덱스 의미 ㅇㅇ 인덱스 / k %= 0이면 그 인덱스 값 + 1


 */