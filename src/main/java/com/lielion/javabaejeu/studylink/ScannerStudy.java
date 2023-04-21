package com.lielion.javabaejeu.studylink;

// Scanner 와 Scanner 와 같이 쓰이는 next 함수 공부하기

import java.util.Scanner; // import Scanner()Method
public class ScannerStudy {
    public static void main(String[] args) {
        String nextTest;
        Scanner sc = new Scanner(System.in);
        nextTest = sc.next(); // next() String, 사용자가 입력한 문자열 값 (엔터치기 전 공백은 포함x)
        System.out.printf("%s",nextTest); // asd f 입력시 asd만 nextTest에 저장 되고 공백+f 는 후에 실행될 입력 메소드에 넘겨준다.
        // 이번에는 nextLine() , 사용자가 입력한 문자열 값 (엔터치기 전 공백도 포함)
        System.out.println(sc.nextLine()); // 1
        System.out.printf("%s", sc.nextLine()); // 2
        // System.out.println(sc.nextLine()); // 3
        // System.out.println();
        /*
        10  // next() 10 + enter(\n)입력
        10  // next() 10 출력
            // nextLine() 남은 \n 포함 읽고 \n 버린 나머지만 출력인데 없다. 그래서 출력 x
        10  // nextLine() 2 에서 10 + enter 10\n 이니까 10 출력  \n없애고 10만 출력
        10  // nextLine() 3 에서 20 + enter 20\n 이니까 20 출력
  -     20  //
        20  //
        */
        System.out.println("--------------next vs next Line 끝 ---------------");







    }
}
