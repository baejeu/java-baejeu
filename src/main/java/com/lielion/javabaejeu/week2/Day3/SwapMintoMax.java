package com.lielion.javabaejeu.week2.Day3;

import java.util.Arrays;

// 오름차순 알고리즘 구현해보기
public class SwapMintoMax {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 22, 9, 5, 3, 10 , 12};   // {1, 2, 4, 6, 7, 8}  {1,2,4,7,6,8}

        int temp;  // 값 저장용
        int cnt = 0;
        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1; i++) {   // 0~5 6번반복
                temp = arr[i];
                System.out.println(i);
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                 }

            }
        }
        System.out.println("-----------------");
        System.out.println(Arrays.toString(arr));
        }
    }
