package com.lielion.javabaejeu.studylink.youtube.Ch6;

/*
생성자 this()
생성자에서 다른 생성자 호출할 때 사용
다른 생성자 호출시 첫 줄에서만 사용가능

참조변수 this (선언 안하고 사용)
인스턴스 자신을 가리키는 참조변수
인스턴스 메서드 (생성자 포함)에서 사용 가능
지역 변수 lv 와 인스턴스 변수 iv를 구별할 때 사용


 */

class Car{
    String color;      // 색상
    String gearType;   // 변속기 종류 = auto 자동, manual 수동
    int door;          // 문의 개수

    Car(){
        this("black","auto", 4);


    }
    Car(String c, String g, int d ){
        this.color = c;
        this.gearType = g;
        this.door = d;
    }

}

public class ConstructorThis {
    public static void main(String[] args) {
        Car c = new Car();
        System.out.printf(" 차의 기본 색상은 %s , 변속기 종류는 %s , 문의 개수는 %d\n",  c.color, c.gearType ,c.door);
        // 객체 생성만 했는데 차의 기본 색상, 변속기 종류, 문의 개수를 생성자로 정해줬다.

        Car c2 = new Car("red", "auto", 6);
        System.out.printf(" 차의 기본 색상은 %s , 변속기 종류는 %s , 문의 개수는 %d",  c2.color, c2.gearType ,c2.door);
    }
}

