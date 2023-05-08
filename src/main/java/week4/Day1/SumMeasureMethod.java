package week4.Day1;

import java.util.Scanner;

public class SumMeasureMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int input4 = sc.nextInt();

        System.out.println(sumOfFactors(input1));
        System.out.println(sumOfFactors(input2));
        System.out.println(sumOfFactors(input3));
        System.out.println(sumOfFactors(input4));

    }

    public static int sumOfFactors(int num){
        int sum = 1;
        for (int i = 2; i <= num ; i++) {
            if (num % i ==0 ){
                sum = sum + i;
            }
        }
        return sum;
    }

}
