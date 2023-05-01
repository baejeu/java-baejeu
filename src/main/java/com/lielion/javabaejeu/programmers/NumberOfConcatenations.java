package com.lielion.javabaejeu.programmers;

import java.util.*;

public class NumberOfConcatenations {
    public static void main(String[] args) {

    }

    class Solution {
        public int solution(int[] num_list) {

            int size = num_list.length;
            String answer2 ="";
            String answer3 ="";
            int sum =0;
            int answer = 0;
            for (int i = 0; i < size ; i++) {

                if (num_list[i]%2==0){
                    answer2 = answer2 + String.valueOf(num_list[i]);
                }
                else {
                    answer3 = answer3 + String.valueOf(num_list[i]);
                }
            }

            answer = Integer.parseInt(answer2)+Integer.parseInt(answer3);

            return answer;
        }
    }
}
