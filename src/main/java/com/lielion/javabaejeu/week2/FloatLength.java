package com.lielion.javabaejeu.week2;

public class FloatLength {
    public static void main(String[] args) {
        float f1 = 3.141592f;
        double d1 = 3.141592653589793;
        float f2 =  0.123456789f;
        System.out.println(f1); // 3.141592
        System.out.println(d1); // 3.141592653589793
        System.out.println(f2);
    }
}

/*
① float 타입에 담을 때는 소수점 이하 6자리까지 담는 것이 반올림을 고려했을 때 좋은 선택입니다.
그리고 f를 붙여 줍니다.

② 3.141592653589793은 float에 담으면 소수점이 잘려서 정확도가 떨어지기 때문에 double에
담아 줍니다.

핵심: float는 default로 출력이 1.0f 기준 1.000000 이런식으로 소수점 6자리 까지 출력이고
1.123456789 이런식으로 float 범위 초과이면 소수점 8자리에서 반올림한 소수점 7자리 까지 출력을 해준다.

 */