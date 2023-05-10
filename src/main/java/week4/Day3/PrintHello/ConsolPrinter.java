package week4.Day3.PrintHello;

import week4.Day3.PrintHello.Printer2;

public class ConsolPrinter implements Printer2 {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
