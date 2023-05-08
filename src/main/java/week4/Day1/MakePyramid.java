package week4.Day1;

import java.util.Scanner;
public class MakePyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         int input = sc.nextInt();

        for (int i = 0; i < input ; i++) {
            for (int j = input; j-i-1 > 0 ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i*2)+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
