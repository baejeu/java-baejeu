package com.lielion.javabaejeu.week2.Day2;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        String []stringArray = new String[3];
        float []floatArray = new float[3];
        System.out.println(stringArray[0]);   // String 배열은 참조타입 배열이어서 기본값이 null
        System.out.println(floatArray[0]);    // float 배열은 기본(원시)타입 배열이어서 기본값이 0.0 이다 ex) int는 0

    }
}
