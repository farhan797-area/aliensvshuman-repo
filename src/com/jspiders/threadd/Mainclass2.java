package com.jspiders.threadd;


public class Mainclass2 {
    public static void main(String[] args) {
        System.out.println("Thread starts.....");
        Runnable r1 =()-> {
            System.out.println("Task 1 starts....");
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
            System.out.println("Task 1 ends....");
        };
        Runnable r2 = ()->{
            System.out.println("Task 2 starts....");
            for (int j = 1; j <= 5; j++) {
                System.out.println(j);
                System.out.println("Task 2 ends....");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Thread t2 = new Thread(r2);
        t2.start();
        System.out.println("Main thread ends....");

    }
}
