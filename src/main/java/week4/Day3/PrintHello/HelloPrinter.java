package week4.Day3.PrintHello;

import java.io.IOException;
public class HelloPrinter {
    // 파일에도 저장 하고 싶고
    // 콘솔에도 출력 하고 싶다
    Printer2 printer;

    public HelloPrinter(){
        this.printer = new ConsolPrinter();
    }
    public HelloPrinter(Printer2 printer) {
        this.printer = printer;
    }
    // 반복 기능
    public void repeatMessage(int n, String message) throws IOException {
        for (int i = 0; i < n ; i++) {
            printer.print(message);
        }
    }
    // Printer2 printer = new FilePrinter();
    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new ConsolPrinter());
        hp.repeatMessage(5, "hello");
        HelloPrinter hp2 = new HelloPrinter(new FilePrinter());
        // hp2.printer.print("hello");
        FilePrinter fp = new FilePrinter();
        fp.print("hello", 5);
        HelloPrinter sx = new HelloPrinter();
        sx.printer.print("baejeu");
    }
}

// HelloPrinter hp2 = new HelloPrinter