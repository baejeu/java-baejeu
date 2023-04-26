package com.lielion.javabaejeu.week2.Day1;

public class DivideIntoTwo {
    public static void main(String[] args) {
//        1 + 1 / 2
        float fOne = 1;
        float fTwo = 2;
        System.out.printf("%f\n", fOne + fOne / fTwo); // 1.500000

        int iOne = 1;
        int iTwo = 2;
        System.out.printf("%d\n", iOne + iOne / iTwo);  // 1

        System.out.printf("%d\n", 9 / 2);               // 4
        System.out.printf("%f\n", 9 / 2.0);             // 4.500000
    }
}

/*
float: 32 비트 double : 64비트
float: 대략 7자리의 정밀도 1.000000 소수점 6자리까지
double : 대략 15자리의 정밀도 1.00000000000000 소수점 14자리까지

넘어간다면?
DigDecimal을 씁니다. (Class)

float f2 = 1.23e10f; 을 한글로 쓰면?
1.23 * 10의 10승이다.

double d3 = 1.23e1;
double d4 = 1.23 * 10;
System.out.println(d4 == d3);

-> true

가수부 지수부
1.23 00000 000000

 */
