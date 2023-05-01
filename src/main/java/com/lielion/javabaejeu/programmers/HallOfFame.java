package com.lielion.javabaejeu.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class HallOfFame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int input =sc.nextInt();
        // int k =sc.nextInt();

         int k = 4;                                              // k = 명예의 전당 점수 개수   그날 발표 점수는 명예의 전당에서 가장 적은 점수이다.

         int[]score = {0, 300, 40, 300, 20, 70, 150, 50 , 500, 1000 };     // 발표점수 {0, 0, 0, 0, 20, 40, 70, 70, 150, 300}
         System.out.println();

         int[]sout = new int[10];
         sout = solution(k, score);
         System.out.println(Arrays.toString(sout));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];   // 발표 점수 배열
        ArrayList<Integer> fame = new ArrayList<>(); // 명예의 전당 arraylist 선언 ArrayList<타입> 이름 = new ArrayList<>();   // 크기 고정x 부족한 공간 자동으로 늘린다.


        for (int i = 0; i < score.length ; i++) {  // score 길이 만큼 반복 ex) 7
            fame.add(score[i]);
            if (i >= k) {
                fame.remove(Collections.min(fame)); // Collectons - List - ArrayList 상속 (순서 있는 저장공간)
            }
            answer[i] = Collections.min(fame);
        }
        return answer;
    }

}
// Collections 하위 클레스들 전부 복습하기


