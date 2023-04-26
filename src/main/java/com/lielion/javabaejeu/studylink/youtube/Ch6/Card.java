package com.lielion.javabaejeu.studylink.youtube.Ch6;

// 포커 카드로 인스턴스 변수와 클레스 변수 사용 설명
public class Card {
    String kind;; // 무늬    개별 속성
    int number; // 숫지  개별 속성 = 인스턴스 변수

    static int width = 100; // 폭   공통 속성 = 클레스 변수
    static int height = 250; // 높이


    public static void main(String[] args) {
            Card c = new Card();  // 카드 클레스 객체 생성
            c.kind = "HEART";
            c.number = 6;      // 객체 사용 인스턴스 변수에 값 넣기
            c.width = 200;     // 클레스 변수 사용 인데 cv 같은 경우는 아래 처럼 클레스.클레스변수로 하는게 더 맞다?
            Card.height = 300; // 더 좋은 code
    }
}

