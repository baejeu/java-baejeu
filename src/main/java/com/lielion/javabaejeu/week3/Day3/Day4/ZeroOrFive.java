package com.lielion.javabaejeu.week3.Day3.Day4;

import java.util.*;

public class ZeroOrFive {
    public static void main(String[] args) {

        ArrayList<Integer>answer = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int r = sc.nextInt();

        for (int i = s; i < r; i++) {
            if(Solution.isZeroOrFive(i) == true){
                answer.add(i);
            }
        }
        System.out.println(answer);
    }
    class Solution {
        public static boolean isZeroOrFive(int num){
            while (num > 0) {
                int remainder = num % 10;
                if(remainder % 5 != 0){
                    return false;
                }
                num /= 10;
            }
            return true;
        }
    }

}
