package com.lielion.javabaejeu.studylink.youtube.Ch6;
public class SataticMethod {
    class TestClass {

        int iv;            // 인스턴스 변수
        static int cv;     // 클래스 변수

        void instanceMethod(){         // 인스턴스 메서드
            System.out.println(iv);    // 인스턴스 변수 사용 가능
            System.out.println(cv);    // 클래스 변수 사용 가능
        }

        static void staticMethod(){    // Static 메서드
           // System.out.println(iv);  //  에러!! 인스턴스 변수를 사용할 수 없다.
            System.out.println(cv);    //  클래스 변수는 사용할 수 있다.

        }

    }
    public static void main(String[] args) {  // 메인 메서드는 항상 소스파일 이름 == public class 바로 안에 만들어야 한다.
        System.out.println("sex");
    }
}

/*
+ static 메서드 안에서 인스턴스 메서드 또한 호출할 수 없다. ( 인스턴스 메서드가 iv를 사용해서 )
 */