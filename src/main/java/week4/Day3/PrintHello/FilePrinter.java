package week4.Day3.PrintHello;

import week4.Day3.PrintHello.Printer2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer2 {
    // 오버 라이딩
    @Override
    public void print(String message) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
            bw.append(message);
            bw.flush();
            bw.close();
    }
    // 오버 로딩
    public void print(String message, int n) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("./hello.txt"));
        for (int i = 0; i < 5; i++) {
            bw.append(message);
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }


}
// BufferedWriter = 텍스트를 버퍼에 쌓아둔 후에 한번에 파일에 쓰기 위해 사용되는 클레스
// bw.append() = BufferedWriter 객체에 텍스트를 추가하는 메서드입니다. 이 메서드는 지정된 문자열을 현재 버퍼에 추가하고,
// 내부적으로 버퍼를 비우게 됩니다.
