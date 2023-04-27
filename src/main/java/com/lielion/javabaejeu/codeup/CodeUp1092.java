package com.lielion.javabaejeu.codeup;
/*
매우 규칙적이라고 할 때, 다시 모두 함께 문제를 풀게 되는 그날은 언제일까?

예를 들어 3명이 같은 날 가입/등업하고, 각각 3일마다, 7일마다, 9일마다
한 번씩 들어온다면, 처음 가입하고 63일 만에 다시 3명이 함께 문제를 풀게 된다.

같은 날 동시에 가입한 인원 3명이 규칙적으로 방문하는,
방문 주기가 공백을 두고 입력된다. (단, 입력값은 100이하의 자연수이다.)

최소 공배수 구하기?

 */

import java.util.*;
public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input1 = sc.nextInt(); // 첫번째 사람  // 1 12 9
        long input2 = sc.nextInt();
        long input3 = sc.nextInt();
        long cnt = 1;

        while (true){
            cnt++;

            if(cnt%input1==0){
                if(cnt%input2==0){
                    if(cnt%input3==0){
                        System.out.println(cnt);
                        break;
                    }
                    else{
                        continue;
                    }
                }
                else{
                    continue;
                }
            }
            else{
                continue;
            }
        }
    }
}
