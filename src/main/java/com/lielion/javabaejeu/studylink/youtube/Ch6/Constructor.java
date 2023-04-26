package com.lielion.javabaejeu.studylink.youtube.Ch6;

/*

생성자 (constructor)
인스턴스가 생성될 때마다 호출되는 인스턴스 초기화 메서드 ( iv 초기화 메서드)

iv를 편리하게 초기화 하는 용도

생성자의 이름은 클래스 이름과 같아야 한다.
리턴값이 없다. (void 안붙임)
모든 클래스는 반드시 생성자를 가져야 한다.
 */

class Time {
    int hour , minute, second;

    Time(){}                                    // 매개변수 없는 생성자 기본 생성자 만들지 않아도 컴파일러가 자동생성 해준다.
                                                // default constructor 생성자가 하나도  없을 때만 컴파일러가 자동 추가 해준다.
    Time(int hour, int minute, int second){      // 매개변수 있는 생성자 이것도 결국 오버로딩(생성자 오버로딩 이다.)
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        // 인스턴스 생성 시 수행될 코드
        // 주로 인스턴스 변수의 초기화 코드를 적는다.
    }


}

public class Constructor {
    public static void main(String[] args) {
        Time t = new Time(); // 기본 생성자
        t.hour = 12;
        t.minute = 34;
        t.second = 56;

        Time t2 = new Time(1, 2, 3);
        System.out.println(t2.hour + t2.minute + t2.second);  // 1+2+3 = 6나와야함


    }


}


