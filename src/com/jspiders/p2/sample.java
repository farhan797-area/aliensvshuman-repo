package com.jspiders.p2;
import com.jspiders.p1.demo;

public class sample extends demo{
    public static void main(String[] args) {
        System.out.println("Program starrts....");
        demo d1 = new demo();

        System.out.println("d1.v1:"+d1.v1);
        d1.test1();


        sample s1 =  new sample();
        System.out.println("s1.v2:"+s1.v2);
        s1.test2();

        System.out.println("Program endsss......");

    }
}
