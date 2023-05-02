package com.lielion.javabaejeu.StudyPractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListListlteratorPractice {
    public static void main(String[] args) {

        ArrayList<String>list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("two");
        System.out.println(list); // [one, two, two]
        System.out.println(list.size()); // 3
        list.clear();
        System.out.println(list); // []



        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list); // [one, two, three]
        ListIterator listIterator = list.listIterator();


        while(listIterator.hasNext()){ // 순방향
            System.out.println(listIterator.next()); // one two three
        }
        while (listIterator.hasPrevious()){ // 역방향
            System.out.println(listIterator.previous()); // three two one
        }




    }
}
