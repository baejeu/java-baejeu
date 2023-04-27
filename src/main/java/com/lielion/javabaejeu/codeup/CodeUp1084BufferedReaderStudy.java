package com.lielion.javabaejeu.codeup;

/*
[기초-종합] 빛 섞어 색 만들기
빨강(r), 초록(g), 파랑(b) 각각의 빛의 개수가 주어질 때,
(빛의 강약에 따라 0 ~ n-1 까지 n가지의 빛 색깔을 만들 수 있다.)
 */
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer; // StringTokenizer에 nextToken()함수를 쓰면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있다.


public class CodeUp1084BufferedReaderStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // br.readLine()을 사용하려면  메인 메소드에 thorws IOException이 필요하다.
        StringTokenizer st = new StringTokenizer(input); // StringTokenizer 인자값에 입력 문자열 너흠
        int inputRed = Integer.parseInt(st.nextToken());
        int inputGreen = Integer.parseInt(st.nextToken());
        int inputBlue = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 할당된 버퍼에 값 넣어주기

        // String s = "abcdefg";   //출력할 문자열
        // bw.write(s+"\n");   //버퍼에 있는 값 전부 출력
        // bw.flush();   //남아있는 데이터를 모두 출력시킴
        // bw.close();   //스트림을 닫음

        int cnt = 0;

        for (int i = 0; i <inputRed ; i++) {
            for (int j = 0; j < inputGreen; j++) {
                for (int k = 0; k < inputBlue; k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    cnt ++;
                }
            }
        }
        bw.write(String.valueOf(cnt));  // 츨력도 문자열 type으로 해줘야함
        bw.flush();
        bw.close();
    }

        /* 시간초과 발생
        Scanner sc = new Scanner(System.in);
        int inputRed = sc.nextInt();
        int inputGreen = sc.nextInt();
        int inputBlue = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i <inputRed ; i++) {
            for (int j = 0; j < inputGreen; j++) {
                for (int k = 0; k < inputBlue; k++) {
                    System.out.printf("%d %d %d\n", i ,j, k);
                    cnt ++;
                }
            }
        }
        System.out.println(cnt);

         */
    }

/*
BufferedReader BufferedWriter
버퍼를 이용해서 읽고 쓰는 함수
입출력의 효율이 좋아진다.
특징
버퍼를 사용하지 않는 입력은, 키보드의 입력이 키를 누르는 즉시 바로 프로그램에 전달된다.
버퍼를 사용하는 입력은 키보드의 입력이 있을 때마다 한 문자씩 버퍼로 전송된다.
String으로 입력값이 고정되어있기 때문에 다른 타입으로 입력받고싶다면 형변환이 필요하다.
예외처리를 꼭 해주어야한다는 점이다. readLine을 할때마다 try & catch를 활용하여 예외처리를 해주어도 되지만 대개 throws IOException을 통하여 작업한다.

throw 이용 시

(1) 클래스를 import해주어야 한다.

import java.io.IOException;

(2) main 클래스 옆에 throws IOException를 작성한다.

public static void main(String[] args) throws IOException {}

사용법
BufferedReader :Scanner와 유사

Bufferedwriter :System.out.println();과 유사

Read한 데이터는 Line단위로만 나눠지기에 공백단위로 데이터를 가공하려면 따로 작업을 해주어야하는데, 위의 두가지 방법이 대표적이다.

첫번째 방법으로는 StringTokenizer에 nextToken()함수를 쓰면 readLine()을 통해 입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있다.

두번째 방법으로는 String.split()함수를 활용하여 배열에 공백단위로 끊어서 데이터를 넣고 사용하는 방식이다.

BufferedWriter 의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush() / close() 를 반드시 호출해 주어 뒤처리를 해주어야 한다.

그리고 bw.write에는 System.out.println();과 같이 자동개행기능이 없기때문에 개행을 해주어야할 경우에는 \n를 통해 따로 처리해주어야 한다.



 */