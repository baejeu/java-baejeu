package com.lielion.javabaejeu.programmers;

import java.util.*;

public class Queries3 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4};
        int [][] queries = {{0,3}, {1,2}, {1,4}};
        Solution.solution(arr, queries);
        System.out.println(Arrays.toString(arr));

        int test = queries.length;
       // System.out.println(test);

    }
    // [0, 1, 2, 3, 4]	[[0, 3],[1, 2],[1, 4]]	[3, 4, 1, 0, 2]
    class Solution {
        public static int[] solution(int[] arr, int[][] queries) {

            int a =0;
            int b =0;
            int temp;

            for (int i = 0; i < queries.length ; i++) {
                    int j= 0;
                    a = queries[i][j];
                    b = queries[i][j+1];
                    temp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = temp;

            }
            return arr;
        }
    }
}
