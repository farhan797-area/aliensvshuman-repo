package com.jspiders.java8;



interface Run1 {
    public void test();

    public static void count() {
        System.out.println("this is static-count() of Run1 interface");
    }

    public default void view() {
        System.out.println("this is default-view() of Run1 interface");
    }
}
    class demo implements Run1{
        @Override
        public void test() {
            System.out.println("Overriding test() in demo class");
        }
    }
    class Sample  implements Run1{
        @Override
        public void test() {
            System.out.println("Overriding test() in sample class");
        }
    }


public class Mainclass2 {
    public static void main(String[] args) {
        System.out.println("Program starts....");

        Run1.count();

        demo d1 = new demo();
        d1.view();

        Sample s1 = new Sample();
        s1.view();
        System.out.println("Program ends....");
    }
}
