package com.jspiders.Multithreads;



class counter{
    private int value = 0;

    synchronized public void increment(){
        value++;
    }
    synchronized public void decrement(){
        value--;
    }
    synchronized public void showvalue(){
        System.out.println(value);
    }
}

public class Mainclass {
    public static void main(String[] args) {
        counter c1 = new counter();
        c1.showvalue();

        Runnable task1 = ()->{
            System.out.println("Thread 1 start");
            c1.increment();
            c1.showvalue();
            System.out.println("Thread 1 end");
        };

        Runnable task2 = ()->{
            System.out.println("Thread 2 start");
            c1.decrement();
            c1.showvalue();
            System.out.println("Thread 2 end");
        };


        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        System.out.println("main ENDS .....");
    }
}
