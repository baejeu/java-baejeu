package week4.Day2;

public class PyramidShapeDrawer extends ShapeDrawer {
    public String makeAline(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i - 1), "*".repeat(2 * i + 1));
    }
    // 추상 메소드 오버라이딩(Method 오버라이딩) : 메소드를 재정의하는것   추상 메소드는 재정의는 아니고 구현 하는 것.
}
