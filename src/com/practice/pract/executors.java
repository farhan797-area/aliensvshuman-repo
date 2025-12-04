package com.practice.pract;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executors {
    public static void main(String[] args) {
        System.out.println("main STARTS .....");
        ExecutorService es2 = Executors.newCachedThreadPool();
        Runnable task1 = ()-> {
            System.out.println("Main running");
        };
        for (int i = 0; i < 10; i++) {
            es2.submit(task1);
        }
        es2.shutdown();

//        ExecutorService es1 = Executors.newSingleThreadExecutor();
//        es1.submit(task1);
//        es1.shutdown();


//        ExecutorService es1 = Executors.newCachedThreadPool();
//        es1.submit(task1);
//        es1.shutdown();
        System.out.println("main ENDS .....");


    }

}
