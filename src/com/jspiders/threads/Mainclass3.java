package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass3 {
    public static void main(String[] args) {
        System.out.println("main starts .....");
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("cores: " + cores);
        ExecutorService e1 = Executors.newScheduledThreadPool(cores);
        Runnable task1 = ()-> {
            System.out.println("Running task1");
        };
        for (int i = 1; i <= 5; i++) {
            e1.submit(task1);
        }
        e1.shutdown();
        System.out.println("main ends .....");
    }
}
