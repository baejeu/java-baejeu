package week4.Day2;
// 1개 이상의 추상 메소드를 초함하는 클래스 = 추상 클레스
public abstract class ShapeDrawer {
    public void printShape(int height){
        for (int i = 0; i < height ; i++) {
            System.out.println(makeAline(height , i));
        }

    }
    public abstract String makeAline(int h, int i);
}
// 이걸 템플릿 메소드 패턴이다.  https://coding-factory.tistory.com/712