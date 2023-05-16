package com.lielion.javabaejeu.week5.day2;

import java.util.Arrays;

public class InsertionSortOOP {
    boolean choice = true;
    public int [] sort(int[] arr , boolean choice){
        for (int i = 1; i < arr.length ; i++) {
            for (int j = i;  j > 0 ; j--) {
                int temp = arr[j-1];
                if (choice ? arr[j] < arr[j-1] : arr[j] > arr[j-1]) {
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else break;
            }
        }
        return arr;
    }

    public int[] sort(int arr[]){
        return sort(arr, true);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28 , 11};
        // choice true 오름차순 false 내림차순

        InsertionSortOOP insertionSort = new InsertionSortOOP();
        System.out.println(Arrays.toString(insertionSort.sort(arr))); // 오름차순
        System.out.println(Arrays.toString(insertionSort.sort(arr, false))); // 내림차순

    }
}
