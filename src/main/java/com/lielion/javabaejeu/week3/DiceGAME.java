package com.lielion.javabaejeu.week3;

import java.util.Scanner;

public class DiceGAME {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input1= sc.nextInt();
        int input2= sc.nextInt();
        int input3= sc.nextInt();

        Solution.solution(input1,input2,input3);


    }

    class Solution {
        public static int solution(int a, int b, int c) {
            int answer = 0;

            if ( a != b && b !=c ){
                answer = a+b+c;
            }
            else if (( a==b && b !=c )||(b==c && a != b)||(a==c && a!=b)){
                answer =(a+b+c)*(a*a+b*b+c*c);
            }
            else{
                answer =(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
            }

            return answer;
        }
    }
}
