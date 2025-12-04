package com.jspiders.p1;

public class Mainclass {
    public static void main(String[] args) {
        demo d1 = new demo();
        System.out.println("d1.v1:"+d1.v1);
        d1.test1();
        d1.v1 = 500;

        System.out.println("d1.v2:"+d1.v2);
        d1.test2();

    }
}
