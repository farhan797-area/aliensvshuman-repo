package com.jspiders.threadd;


class demo extends Thread{
    @Override
    public void run(){
        System.out.println("Count() demo starts");
        for(int i = 0; i<=5;i++){
            System.out.println(i);
        }
        System.out.println("Count() demo ends");
    }
}
class sample extends Object implements Runnable{
    @Override
    public void run(){
        System.out.println("Count() sample starts");
        for(int i = 0; i<=5;i++){
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Count() sample ends");
    }
}

public class Mainclass {
    public static void main(String[] args) {
        demo d1 = new demo();
        d1.start();
        sample s1 = new sample();
        Thread t1 = new Thread(s1);
        t1.start();
    }
}
