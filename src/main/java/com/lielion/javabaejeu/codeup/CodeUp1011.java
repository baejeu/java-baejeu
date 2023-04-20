package com.lielion.javabaejeu.codeup;

/*
1011번

문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
변수에 저장되어 있는 문자를 그대로 출력해보자.

*/
import java.util.Scanner;
public class CodeUp1011 {
    public static void main(String[] args) {

        char charstore; // 문자 저장 변수 선언
        Scanner sc = new Scanner(System.in);
        charstore = sc.next().charAt(0);
        System.out.println(charstore);
    }
}
/*
sc.next()? :  문자열을 입력받는 메소드
.charAt()? :  string.charAt(0) <-- 문자열의 첫번째 문자 꺼내오기

sc.next().charAt(0); 문자 받아오는 메소드

 */