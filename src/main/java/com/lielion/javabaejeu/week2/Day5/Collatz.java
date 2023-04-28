package com.lielion.javabaejeu.week2.Day5;

import java.util.Scanner;
public class Collatz {
    public static void main(String[] args) {
        int num = 9999999;
        int answer = solution(num);
        System.out.println(answer);
    }

        public static int solution (int num){
            int answer = 0;
            if(num != 1){
                while(true) {
                    answer++;
                    if (num % 2 == 0) {
                    num = num / 2;
                    }
                    else if (num % 2 == 1) {
                    num = num * 3 + 1;
                    }
                    if (num == 1) {
                    break;
                    }
                    if (answer>=500){
                        answer =-1;
                        break;
                    }
                }
            return answer;
            }
            else{
                answer = 0;
                return answer;
            }
        }

}



