package com.lielion.javabaejeu.programmers;

import java.util.*;

public class Queries2 {
    public static void main(String[] args) {
        /*
        int[] arr = {0,1,2,4,3};
        int[][] queries = {{0,4,2}, {0,3,2},{0,2,2}};

        System.out.println(Arrays.toString(Solution.solution(arr,queries)));
        */
    }

    class Solution {
        public static int[] solution(int[] arr, int[][] queries) {

            int[] answer = new int[queries.length];

            ArrayList<Integer> check = new ArrayList<>();

            for (int i = 0; i < queries.length ; i++) {
                int min = Integer.MAX_VALUE;
                int s = queries[i][0];
                int e = queries[i][1];
                int k = queries[i][2];
                check.clear();
                for (int j = s; j <= e ; j++) {  // 0~4
                    if (arr[j] >k){
                       check.add(arr[j]);
                    }
                }
                if (check.isEmpty()){
                    answer[i] = -1;
                }
                else {
                    answer[i] = Collections.min(check);
                }
            }
            return answer;
        }
    }

}
// 0 <= i <= 4    i>2   3,4      //