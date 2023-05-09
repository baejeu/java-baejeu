package week4.Day2;

public class ReversePyramid {
    private String spaceChar = "0";
    public int a;

    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(i), "*".repeat(height+3-(i*2)));
        }
    }
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
       // Pyramid2 pyramidSpaceZero = new Pyramid2("0");
        reversePyramid.printPyramid(4);
       //  pyramidSpaceZero.printPyramid(5);
        reversePyramid.a = 3;
    }
}