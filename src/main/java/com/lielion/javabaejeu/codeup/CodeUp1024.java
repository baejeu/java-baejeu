package com.lielion.javabaejeu.codeup;

/*
단어를 1개 입력받는다.
입력받은 단어(영어)의 각 문자를
한줄에 한 문자씩 분리해 출력한다.

'B'
'o'
'y'

 */

import java.util.Scanner;
public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input2 = sc.next();
        for (int i = 0; i < input2.length() ; i++) {
            System.out.printf("%c", '\'');
            System.out.printf("%c",input2.charAt(i));
            System.out.printf("%c\n", '\'');
        }

    }
}
