package com.lielion.javabaejeu.codeup;
// 입력으로 주어진 수가 소수이면 "prime"을 출력, 소수가 아니면 "not prime"을 출력한다.
import java.util.*;
public class CodeUp1274 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(isPrime(input));
    }

    static String isPrime(int num){

        ArrayList<Integer>check = new ArrayList<>();
        for (int i = 1; i <= num ; i++) {
            if (num%i==0){
                check.add(i);
            }
        }
        //System.out.println(check.size());
        if (check.size()>2){
            return "not prime";
        }
        else return "prime";

    }
}
