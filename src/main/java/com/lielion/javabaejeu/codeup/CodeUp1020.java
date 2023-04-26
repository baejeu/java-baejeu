package com.lielion.javabaejeu.codeup;

/*
주민번호는 다음과 같이 구성된다.

XXXXXX-XXXXXXX

앞의 6자리는 생년월일(yymmdd)이고 뒤 7자리는 성별, 지역, 오류검출코드이다.
주민번호를 입력받아 형태를 바꿔 출력해보자.

 */

import java.util.Scanner;
public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String SecurityNumber = sc.next();              //981212-1234567
        String SecurityNumber1 = SecurityNumber.substring(0,6);   // 생년월일 - 앞부분
        String SecurityNumber2 = SecurityNumber.substring(7); // - 뒷부분
        String SecurityNumber3 = SecurityNumber1 + SecurityNumber2;
        System.out.println(SecurityNumber3);

        String ParseIntTest = "0000011";
        int ParseIntTest2 = Integer.parseInt(ParseIntTest);

        System.out.println(ParseIntTest2); // 11 출력 한다  앞에 00000삭제
        double ParseDoubleTest = Double.parseDouble(ParseIntTest);
        System.out.println(ParseIntTest2);

    }
}

/*
str.substring(0, 2)는 str 문자열의 인덱스 0부터 2 이전까지의 부분 문자열을 반환합니다.
 */