package com.lielion.javabaejeu.codeup;
/*
[기초-종합] 여기까지! 이제 그만~
예를 들어 57을 입력하면
1+2+3+...+8+9+10=55에 다시 11을 더해 66이 될 때,
그 값 66이 출력되어야 한다.
 */

import java.util.*;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long input = sc.nextLong();
        long sum = 0;
        long cnt = 1;
        while (true){
            sum += cnt;
            cnt++;
            if(sum>=input){
                break;
            }
        }
        System.out.println(sum);
    }
}
