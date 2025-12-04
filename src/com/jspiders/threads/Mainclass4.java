package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class Mainclass4 {
    public static void main(String[] args) {
        System.out.println("main starts .....");
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("cores: " + cores);
        ScheduledExecutorService e1 = Executors.newScheduledThreadPool(cores);
        Runnable task1 = ()-> {
            System.out.println("Running task1");
        };
        //e1.scheduleAtFixedRate(task1,2,3, TimeUnit.SECONDS);
        e1.scheduleWithFixedDelay(task1, 0, 5, TimeUnit.SECONDS);
        //e1.scheduleAtFixedRate( task1, 1, 5, TimeUnit.SECONDS);
        e1.shutdown();
        System.out.println("main ends .....");
    }
}
