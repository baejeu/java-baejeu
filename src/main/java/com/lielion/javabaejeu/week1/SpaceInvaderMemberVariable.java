package com.lielion.javabaejeu.week1;

public class SpaceInvaderMemberVariable {
    int location ; // 멤버변수

    public void moveLeft(){
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }

    public void moveRight(){
        location = location + 1;
        System.out.printf("moveRight: %d\n", location);
    }

    public void printLocation(){
        System.out.printf("현재 위치: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable simv = new SpaceInvaderMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveLeft();
        simv.printLocation();
        System.out.printf("현재 위치: %d", simv.location);
    }

}
