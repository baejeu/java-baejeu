package com.lielion.javabaejeu.StudyPractice;

import java.util.*;
import java.util.ArrayList;
import java.util.ListIterator;
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // 문자열 타입 ArrayList 생성

        list.add("one");

        list.add("two");

        list.add("three");

        ListIterator iterator = list.listIterator();

        // 순방향

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

        //역방향

        while (iterator.hasPrevious()) {

            System.out.println(iterator.previous());

        }


    }
}
