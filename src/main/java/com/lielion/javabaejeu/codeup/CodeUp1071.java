package com.lielion.javabaejeu.codeup;

/*
[기초-반복실행구조] 0 입력될 때까지 무한 출력하기1

정수가 순서대로 입력된다.
-2147483648 ~ +2147483647, 단 개수는 알 수 없다.

0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
while( ), for( ), do~while( ) 등의 반복문을 사용할 수 없다.


 */
import java.util.*;

public class CodeUp1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if (num==0){
                break;
            }
            System.out.println(num);

        }

    }
}
