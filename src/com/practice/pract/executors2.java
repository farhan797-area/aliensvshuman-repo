package com.practice.pract;

import java.security.spec.ECField;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class executors2 {
    public static void main(String[] args) {
       int cores =  Runtime.getRuntime().availableProcessors();

        System.out.println("Number of threads in the System:"+cores);
        ExecutorService es = Executors.newWorkStealingPool(cores);
        Runnable r2 = ()->{
            System.out.println("Task running ");
        };
       // ExecutorService es = Executors.newScheduledThreadPool(cores);
        es.submit(r2);
        //es.shutdown();
    }
}
