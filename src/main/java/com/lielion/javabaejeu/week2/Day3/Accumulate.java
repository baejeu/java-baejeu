package com.lielion.javabaejeu.week2.Day3;

import java.util.Scanner;

    public class Accumulate {
        public static void main(String[] args) {
            int num = 687;
            int answer = 0;
            answer = answer + num % 10;
            System.out.printf("answer:%d\n", answer);
            num = num / 10;
            answer = answer + num % 10;
            System.out.printf("answer:%d\n", answer);
            num = num / 10;
            answer = answer + num % 10;
            System.out.printf("answer:%d\n", answer);

            System.out.println("-------------------");
            int myAccount = 1_000_000;
            myAccount = myAccount - 500_000;
            System.out.println(myAccount);
            myAccount = myAccount + 4_000_000;
            System.out.println(myAccount);

            System.out.println("-------------------");
            String answer2 = "";
            answer2 = answer2 + "쿵";
            System.out.println(answer2); //
            answer2 = answer2 + "짝";
            System.out.println(answer2); //

            System.out.println("--------------------");

            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int sum = 0;

            while (number > 0) {
                int remainder = number % 10;
                sum = sum + remainder;
                number = number / 10;

                System.out.println(sum);


            }
        }
    }




