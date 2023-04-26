package com.lielion.javabaejeu.studylink.youtube.Ch6;


// ch6-23 기본형 매개변수
// ch6-24 참조형 매개변수 read

class Data {int x;}

class Data2 {int y;}

public class Ex6_6 {
    public static void main(String[] args) {
        Data d = new Data(); // 객체 생성
        d.x = 10; // x == 10
        System.out.println("main() : x = " + d.x);

        change(d.x); // 기본형 매개변수 int 10 입력
        System.out.println("After change(d.x)");
        System.out.println("main() : x =" + d.x); // main() " x = 10 출력

        System.out.println("------------------------------------");

        Data2 d2 = new Data2();
        d2.y = 10; // y == 10
        System.out.println("main() : x = " + d2.y); // 10 출력
        change2(d2); // 참조형 매개변수 Data d2 입력
        System.out.println("After change(d2)");
        System.out.println("main() : y =" + d2.y); // main() " y = 1000 출력

    }

    static void change (int x) { // x = 10
        x =1000;
        System.out.println("change() : x = " + x);  // change() : x = 1000 출력
    }

    static void change2 (Data2 d2) { // Data2 d2객체 주소
        d2.y =1000;
        System.out.println("change() : y = " + d2.y);  // change() : y = 1000 출력
    }

    // 메소드에 객체 주소를 매개변수로 주니까 메소드 안에서 인스턴스 변수에 접근이 가능해졌다. read & write 가능


}
