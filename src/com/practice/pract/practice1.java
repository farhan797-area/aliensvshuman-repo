package com.practice.pract;

class demo extends Thread{
    public void run(){
        System.out.println("demo starts");
        for(int j=0;j<=5;j++){
            System.out.println(j);

        }
        System.out.println("demo ends");
    }
}
class sample extends Object implements Runnable{
    public void run(){
        System.out.println("sample starts");
        for(int j=0;j<=5;j++){
            System.out.println(j);
        }
        System.out.println("sample ends");
    }
}

public class practice1 {
    public static void main(String[] args) {
        demo de = new demo();
        de.start();
        sample s = new sample();
        Thread t = new Thread(s);
        t.start();

    }
}
