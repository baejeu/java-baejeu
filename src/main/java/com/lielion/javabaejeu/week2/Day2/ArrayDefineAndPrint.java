package com.lielion.javabaejeu.week2.Day2;

import java.util.Arrays;
public class ArrayDefineAndPrint {
    public static void main(String[] args) {
        int[] iArr = new int[]{1, 2, 3, 8};
        System.out.printf("%d %d %d %d\n", iArr[0], iArr[1], iArr[2], iArr[3]);
        System.out.println(Arrays.toString(iArr));
    }
}
