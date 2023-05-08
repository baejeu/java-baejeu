package week4.Day1;

import java.util.*;
public class MakeRightTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = input; j-i-1 > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
