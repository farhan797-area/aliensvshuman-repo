package com.jspiders.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainclass1 {
    public static void main(String[] args) {
        System.out.println("main STARTS .....");
        Runnable task1 = ()->{
            for (int i=0;i<=5;i++){
                System.out.println("Running task");
            }
        };
        ExecutorService es1 = Executors.newSingleThreadExecutor();
        es1.submit(task1);
        es1.shutdown();
        System.out.println("main ENDS .....");
    }
}
