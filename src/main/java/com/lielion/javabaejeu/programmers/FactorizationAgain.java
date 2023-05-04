package com.lielion.javabaejeu.programmers;

import java.util.*;
public class FactorizationAgain {
    public static void main(String[] args) {
        int n = 420;
        System.out.println(Factorization.Solution.solution(n));
    }

    class Solution {
        public static int[] solution(int n) {
            int[] array = new int[n+1];
            int divisior = 2;
            while(n>1){
                if (n%divisior==0){
                    array[divisior++] = divisior;
                    n = n / divisior;
                }
                else divisior++;
            }

            int count = 0;
            for (int i = 0; i < array.length ; i++) {
                if (array[i] != 0) count++;
            }
            int [] answer = new int[count];

            int cnt = 0;
            for (int i = 0; i < array.length ; i++) {
                if (array[i] != 0){
                    answer[cnt++] = array[i];
                }
            }
            return answer;
        }
    }


}
