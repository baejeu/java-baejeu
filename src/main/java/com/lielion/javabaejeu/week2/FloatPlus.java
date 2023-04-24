package com.lielion.javabaejeu.week2;

public class FloatPlus {
    public static void main(String[] args) {
        String val1 = "1.11111111"; // 소수점 여덟 자리
        String val2 = "2.11111111"; // 소수점 여덟 자리
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(result);      // 3.2222223

        /*
        결과가 3.22222222가 아닌 3.2222223이 출력되었습니다. 앞에서 float과 double을 배울 때 float은
        소수점 이하 일곱 자리까지 정확성을 보장하고 double은 소수점 이하 열다섯 자리까지 정확성을
        보장한다고 배웠습니다. 1.11111111, 2.11111111은 각각 소수점 이하 자릿수가 여덟 자리이므로 float
        타입으로 연산을 한다면 정확한 값이 나오지 않습니다. 그래서 이럴 때는 double 타입으로
        연산합니다.
         */

        String val11 = "1.11111111";
        String val22 = "2.11111111";
        double result2 = Double.parseDouble(val11) + Double.parseDouble(val22);
        System.out.println(result2);  //  3.2222222


        System.out.println("--------------------------");
        /*
        String val111 = "1.5";
        String val222 = "2.5";

        int result3 = Integer.parseInt(val111) + Integer.parseInt(val222);
        System.out.println("result = " + result3);  // 에러 발생한다.
        */

        String val111 = "1.5";
        String val222 = "2.5";

        double result3 = Double.parseDouble(val111) + Double.parseDouble(val222);
        System.out.println("result = " + result3);



        /*
        파싱이란?
        문자열이나 데이터를 의미 있는 부분으로 분석하고 구조화하는 과정을 말합니다.
        Integer.parseInt(); → ()안의 문자열을 숫자형으로 구조화 해주어 1 + 1이 11이 아닌 2가 나오게 해줌
        Float.parseFloat(); )안의 문자열을 float형으로 구조화 해주어 1.5 + 2.5가 1.52.5가 아닌 4.0이 나오게 해줌

        기본 타입 -> 기본 타입은 강제형변환 자동형변환 하지만 String -> 기본 타입은 Parse함수 사용
        Double.ParseDouble(변수) 이런 식으로
        Parse 사용시 주의점 ex) "1.5" -> int 는 불가능하다. "1.5"가 형변환시 float, double 실수 함수여서?


         */




    }
}