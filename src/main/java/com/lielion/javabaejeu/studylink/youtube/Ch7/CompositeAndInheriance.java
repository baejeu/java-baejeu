package com.lielion.javabaejeu.studylink.youtube.Ch7;

// 포함관계 vs 상속관계

class Point {
    int x;
    int y;
}

class Circle extends Point {
    int r;

}

class Circle2 {
    Point p = new Point();
    int r;

}


public class CompositeAndInheriance {
    public static void main(String[] args) {

        Circle c = new Circle();  // 상속관계
        c.x =1;
        c.y =2;
        c.r =3;
        System.out.printf("c.x=%d c.y=%d c.r=%d\n", c.x, c.y, c.r);

        Circle2 c2 = new Circle2();  // 포함관계

        c2.p.x = 1;
        c2.p.y = 2;
        c2.r = 3;
        System.out.printf("c2.p.x=%d c2.p.y=%d c2.r=%d", c2.p.x, c2.p.y, c2.r);

    }

}
