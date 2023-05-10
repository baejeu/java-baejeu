package com.lielion.javabaejeu.codeup;
/*
1671 : 가위바위보 게임
(※ 바위=0, 가위=1, 보=2를 말한다.)
1. 바위(0)는 가위(1)를 이긴다.

2. 가위(1)는 보(2)를 이긴다.

3. 보(2)는 바위(0)를 이긴다.

4. 같은 것을 내면 비긴다.

win, tie, lose를 출력한다. 결과는 광현이 중심으로 낸다.
 */

import java.util.*;

public class Q1671 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            int human = sc.nextInt();
            int computer = makeRndom();
            System.out.println("computer="+ computer);
            String answer = RockPaperScissors(human, computer);
            if (answer == "win") {
                System.out.println("you win"); // 이기면 you win 출력 하도록 수정
                break;
            }
        }
        while(true);

    }

    public static int makeRndom(){ // AI 추가..
        int num = 0;
        num  = (int)Math.random()*3;
        return num;
    }

    public static String RockPaperScissors (int human , int computer){
        if (human==0){ // 0은 바위 1은 가위 2는 보
            if (computer == 0) return "tie";
            else if (computer == 1) return "win";
            else if (computer == 2) return "lose";
        }
        else if (human==1){
            if (computer == 0) return "lose";
            else if (computer == 1) return "tie";
            else if (computer == 2) return "win";

        }
        else{ // human == 2
            if (computer == 0) return "win";
            else if (computer == 1) return "lose";
            else if (computer == 2) return "tie";
        }

        return "";
    }

}
