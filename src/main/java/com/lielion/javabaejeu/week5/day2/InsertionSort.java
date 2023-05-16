package com.lielion.javabaejeu.week5.day2;

import java.util.Arrays;

// 삽입정렬 알고리즘 공부
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28 , 11};
        // 1 1 0
        // 2 2 1
        // 2 1 0
        // 3 3 2
        // 3 2 1
        // 3 1 0
        for (int i = 1; i < arr.length ; i++) {
            for (int j = i;  j > 0 ; j--) {
                int temp = arr[j-1];
                if (arr[j] < arr[j-1]){
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
