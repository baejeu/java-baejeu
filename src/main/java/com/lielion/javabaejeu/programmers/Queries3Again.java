package com.lielion.javabaejeu.programmers;

import java.util.*;

public class Queries3Again {
    public static void main(String[] args) {

    }

    class Solution {
        public static int[] solution (int[] arr, int[][]queries ){

            ArrayList<Integer>arrayList = new ArrayList<>(); // ArrayList 선언  배열,리스트,ArrayList ??
            int[] answer = new int[queries.length];
            int s = 0;
            int e = 0;
            int k = 0;
            for (int i = 0; i < queries.length ; i++) {
                s = queries[i][0];
                e = queries[i][1];
                k = queries[i][2];

                for (int j = s; j <= e; j++) {
                    if (arr[j] > k) {
                        arrayList.add(arr[j]);
                    }
                }
                if (arrayList.isEmpty()) {
                    answer[i] = -1;
                } else {
                    answer[i] = Collections.min(arrayList);
                    arrayList.clear(); // 청소
                }
            }
            return answer;
        }
    }
}
