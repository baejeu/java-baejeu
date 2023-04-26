package com.lielion.javabaejeu.studylink.youtube.Ch7;

public class Memo7 {
    public static void main(String[] args) {
        System.out.println("자바 7단원");
    }
}

/*
ch 7-1 상속 Inheritance
기존의 클래스로 새로운 클래스를 작성하는것. (코드의 재사용)
두 클래스를 부모와 자식으로 관계를 맺어주는 것.

class 자식 클래스 extends 부모클래스 {
  // ...
}

자손은 조상의 모든 멤버를 상속받는다. (생성자, 초기화 블럭 제외)
자손의 멤버 개수는 조상보다 적을 수 없다. (같거나 많다.)

class Parent {
    int age;
}

class Child extends Parent {}

자손의 변경은 조상에 영향을 미치지 않는다.

ex)

class Point {   // 2차원 좌표의 한점
    int x;
    int y;

}

class Point3D {                  class Point3D extends Point {      // 두 클레스 멤버 변수는 똑같다.
     int x;                         int z;
     int y;                       }
     int z;
}

ch 7-3 포함 관계

클래스의 관계 1. 상속 관계  2. 포함 관계

포함 composite?
클래스의 맴버로 참조변수를 선언하는 것

ex)
class Point {
    int x;
    int y;
}

class Circle {
    Point c = new Point(); // 원점
    int r;                 // 반지름
}

ch7-4 클래스 간의 관계 결정하기

상속관계 ~은 ~이다. (is-a)
포함관계 ~은 ~을 가지고 있다. (has-a)

원은 점을 가지고 있다. Circle has Point => 포함 관계  포함관계가 90%

ch7-5 단일 상속
Single Inheritance 자바는 단일 상속만 허용한다.







 */