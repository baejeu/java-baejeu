package com.lielion.javabaejeu.week1;

public class UserTest {


    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "jewoo";
        user1.phoneNumber = "010-9289-516x";
        user1.age = 26;

        User user2 = new User();
        user2.name = "subin";
        user2.phoneNumber = "010-9289-1234";
        user2.age = 3;

        System.out.printf("%s는 성인입니까? : %s\n", user1.name , user1.isAdult());
        System.out.printf("%s는 성인입니까? : %s", user2.name , user2.isAdult());

    }
}
