package com.jspiders.collections;

import java.util.ArrayList;

public class Mainclass {
    public static void main(String[] args) {
        System.out.println("Program starts...");
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        System.out.println("the size of the array list is " + a1.size());

        System.out.println("the get method of index 2 is :"+a1.get(2));

        int ub = a1.size();
        for (int i = 0; i < ub; i++) {
            System.out.println(a1.get(i));
        }
        System.out.println("Program ends...");
    }
}
