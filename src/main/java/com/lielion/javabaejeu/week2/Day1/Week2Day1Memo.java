package com.lielion.javabaejeu.week2.Day1;

public class Week2Day1Memo {
    public static void main(String[] args) {
        char A1;
        A1= 'A';
        int B;
        B = (int)A1;
        System.out.println(B);
    }
}
/*
타입 캐스팅

데이터 타입을 변환하는 타입 캐스팅
타입 캐스팅(Type Casting)은 변수를 하나의 데이터 타입에서 다른 데이터 타입으로 변환하는 것을
말합니다. 타입(Type)을 '형'이라고도 하기 때문에 '형 변환'이라고도 합니다.
자바에서는 자동으로 데이터 타입을 변환해 주는 암시적 타입 변환이 일어날 수 있지만, 때에 따라서
명시적으로 데이터 타입을 변환해 주어야 하는 상황이 발생할 수 있습니다.

자동 형 변환(Widening Casting)
● 더 작은 데이터 타입에서 더 큰 데이터
타입으로 변환하는 것
● 자동으로 형 변환이 일어남
● 데이터 손실 없음
● 예: int -> long, float -> double
● 더 큰 데이터 타입에서 더 작은 데이터 타입으로 변환하는 것

강제 형 변환(Narrowing Casting)
● 명시적으로 형 변환을 지정해 주어야 함
● 데이터 손실 가능
● 예: double -> int, long -> short

double dVal = 123.456;
int iVal = (int)dVal;  // 123           0.456이 잘린다 == 데이터 손실







 */