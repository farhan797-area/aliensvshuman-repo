package com.jspiders.collections;

import java.util.LinkedList;

public class Mainclass2 {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("the size of the array list is " + list.size());

        while (list.isEmpty() == false) {
            System.out.println(list.poll());
        }
        System.out.println(list.size());
        System.out.println("Program ends...");
    }
}
