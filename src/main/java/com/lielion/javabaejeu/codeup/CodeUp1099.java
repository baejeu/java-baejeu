package com.lielion.javabaejeu.codeup;
/*
 [기초-2차원배열] 성실한 개미
 개미는 오른쪽으로 움직이다가 벽을 만나면 아래쪽으로 움직여 가장 빠른 길로 움직였다.
 (오른쪽에 길이 나타나면 다시 오른쪽으로 움직인다.)

  미로 상자의 구조가 0(갈 수 있는 곳), 1(벽 또는 장애물)로 주어지고,
  먹이가 2로 주어질 때, 성실한 개미의 이동 경로를 예상해보자.

  미로 상자의 테두리는 모두 벽으로 되어 있으며,
  개미집은 반드시 (2, 2)에 존재하기 때문에 개미는 (2, 2)에서 출발한다.

  10*10 크기의 미로 상자의 구조와 먹이의 위치가 입력된다.
  성실한 개미가 이동한 경로를 9로 표시해 출력한다.


 */

import java.util.*;

public class CodeUp1099 {  // 개미는 오른쪽이나 아래로만 출발 만약 먹이가 있으면 먹이로 먹이는 숫자:2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] BoxArr = new int[10][10];     // 10*10 크기의 미로 상자

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                BoxArr[i][j] = sc.nextInt();
            }
        }
        // 시작은 (2,2)에서 출발  == [1][1]
        // 오른쪽 방향이 아래로 가는 방향 보다 더 우선순위
        // 미로 상자의 구조가 0(갈 수 있는 곳), 1(벽 또는 장애물)로 주어지고,
        // 먹이가 2로 주어질 때, 성실한 개미의 이동 경로를 예상해보자.
        int x = 1;
        int y = 1;
        BoxArr[1][1] = 9;
        while (true){

            if( BoxArr[x][1+y] == 0){
                BoxArr[x][1+y] = 9;
                y++;
            }
            else if( BoxArr [1+x][y] == 0){
                BoxArr [1+x][y] = 9;
                x++;
            }
            if( (BoxArr[x+1][y] == 2) &&  (BoxArr[x][1+y] != 0) ){   // 아랫 방향에 먹이 있으면 가라는 코드
                BoxArr[x+1][y] = 9;
                break;
            }
            else if(BoxArr[x][y+1] == 2){ // 오른쪽 방향에 먹이 있으면 가라는 코드
                BoxArr[x][y+1] = 9;
                break;
            }
        }
       for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", BoxArr[i][j]);
            }
            System.out.println();
        }
    }
}

/*
현재 문제가 오른쪽 방향에 갈 수 있는 길 0 이 있으면 오른쪽 방향으로 가야한다. 아랫 방향에 먹이가 있더라도




 */
