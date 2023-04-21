package com.lielion.javabaejeu.week1;

public class ConstantEx {
    public static void main(String[] args) {
        final int iVal; // 앞에 final을 붙입니다.
        iVal = 1; // 최초에 한 번만 값을 지정할 수 있습니다.
        // iVal = 2; // 한 번 지정한 후 바꿀 수 없습니다.
        System.out.println(iVal);
    }
}
/*
상수 vs 변수
java: variable iVal might already have been assigned
상수에서 최초값 이후 값 변경 시도시 run 하면 에러 발생한다.
원시타입 + 참조 타입에도 final 붙여서 상수로 사용 가능
 */