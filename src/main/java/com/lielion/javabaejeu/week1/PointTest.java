package com.lielion.javabaejeu.week1;

public class PointTest {
    public static void main(String[] args) {
        // 0, 0의 점 만들기
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        System.out.printf("x:%d, y:%d\n", p1.x, p1.y);
        System.out.printf("xy가 같은지? %s\n", p1.isSameXy());

        // 또 다른 점 찍기
        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("x:%d, y:%d\n", p2.x, p2.y);
        System.out.printf("xy가 같은지? %s\n", p2.isSameXy());

        // 또 다른 점 찍기
        Point p3 = new Point();
        p3.x = 3;
        // p3.y = 0 (default: 값 확인)
        System.out.printf("x:%d, y:%d\n", p3.x, p3.y);
        System.out.printf("xy가 같은지? %s\n", p3.isSameXy());
    }
}
