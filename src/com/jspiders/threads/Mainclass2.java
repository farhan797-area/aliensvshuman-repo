package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass2 {
    public static void main(String[] args) {
        System.out.println("main starts .....");
        ExecutorService es2 = Executors.newCachedThreadPool();
        Runnable task1 = ()->{
            System.out.println("task1 running");
        };
        for (int i = 1; i <= 5; i++) {
            es2.submit(task1);
        }
        es2.shutdown();



        System.out.println("main ends .....");
    }
}
