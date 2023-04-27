package com.lielion.javabaejeu.codeup;
/*
[기초-종합] 그림 파일 저장용량 계산하기
일반적인 1024 * 768 사이즈(해상도)의 각점에 대해
24비트(rgb 각각 8비트씩 3개)로 저장하려면 1024 * 768 * 24 bit의 저장 용량이 필요하다.
w, h, b 가 공백을 두고 입력된다.
단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.
소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.

 */

import java.util.*;
import java.io.IOException;
public class CodeUp1086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double b = sc.nextDouble();

        double bitStore = w * h * b;
        double MegaByteStore = bitStore / 1024 / 1024 / 8;

        System.out.printf("%.2f MB",MegaByteStore);
    }
}
