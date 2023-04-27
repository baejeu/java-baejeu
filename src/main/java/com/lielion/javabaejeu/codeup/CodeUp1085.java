package com.lielion.javabaejeu.codeup;
/*
[기초-종합] 소리 파일 저장용량 계산하기
8 bit(비트)           = 1byte(바이트)     //       8bit=1Byte
1024 Byte(210 byte) = 1KB(킬로 바이트) // 1024bit=1KB
1024 KB(210 KB)      = 1MB(메가 바이트)
1024 MB(210 MB)     = 1GB(기가 바이트)
1024 GB(210 GB)      = 1TB(테라 바이트)

h, b, c, s 가 공백을 두고 입력된다.
h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.

1초 동안 마이크로 소리강약을 체크하는 수를 h
한 번 체크한 결과를 저장하는 비트 b
좌우 등 소리를 저장할 트랙 개수인 채널 c
녹음할 시간 s가 주어질 때,

실제로 일반적인 CD 음질(44.1KHz, 16bit, 스테레오)로 1초 동안 저장하려면
44100 * 16 * 2 * 1 bit의 저장공간이 필요하다.



필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.

 */

import java.util.*;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double h = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = sc.nextDouble();

        double bitsum = h * b * c * s;
        double bitTOMB = bitsum / (1024*8*1024);

        System.out.printf("%.1f MB", bitTOMB);

        // 44100 16 2 10

    }
}
