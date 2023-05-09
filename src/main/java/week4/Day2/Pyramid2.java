package week4.Day2;
// 생성자 공부용 생성자 만드는 단축기 Alt + insert
public class Pyramid2 {
    private String spaceChar = "0";

    public Pyramid2(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }
    public static void main(String[] args) {
        Pyramid2 pyramid2 = new Pyramid2(" ");
        Pyramid2 pyramidSpaceZero = new Pyramid2("0");
        pyramid2.printPyramid(4);
        pyramidSpaceZero.printPyramid(5);
    }
}

/*
repeat함수란?
String 클래스의 repeat() 메소드를 사용하여 문자열을 반복할 수 있습니다.
repeat() 메소드는 정수 값을 매개변수로 받으며, 해당 정수 값만큼 문자열을 반복하여 반환합니다. 예를 들어, "abc"라는 문자열을 3번 반복하려면 다음과 같이 작성할 수 있습니다.
String repeatedString = "abc".repeat(3);
System.out.println(repeatedString); // 출력 결과: "abcabcabc"
이렇게 repeat() 메소드를 사용하여 문자열을 반복할 수 있습니다.



 */