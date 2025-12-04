package com.jspiders.collections;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Mainclass4 {
    public static void main(String[] args) {
        System.out.println("program start...");

        LinkedHashSet <Integer> list = new LinkedHashSet<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(null);
        list.add(50);
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
