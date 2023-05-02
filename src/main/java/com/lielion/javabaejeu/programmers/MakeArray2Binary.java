package com.lielion.javabaejeu.programmers;

import java.util.ArrayList;

public class MakeArray2Binary {

    public static void main(String[] args) {

    }

    class Solution {
        public int[] solution(int l, int r) {

            ArrayList<Integer> list = new ArrayList<>();   // 1비트 2 2비트 4 3비트 8 4비트 16 5비트 32 6비트 64 7비트 128 10비트 1024 20비트? 1024*1024

            for (int i = 1; i < 64; i++) {
                int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;   //    Integer.toBinaryString(8); // 1000
                if (l <= num && num <= r)
                list.add(num);
             }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
        }
    }
}

/*
01(2) * 5 = 05 = 5
10(2) * 5 = 50 = 50
11(2) * 5 = 55 = 55
100(2) * 5 = 500 = 500



 */


