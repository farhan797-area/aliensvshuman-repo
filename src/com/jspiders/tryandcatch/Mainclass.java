package com.jspiders.tryandcatch;

public class Mainclass {
    public static void test(int num1, int num2) {
        try{
            int res = num1/num2;
            System.out.println("res:"+res);
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException Occured");
            ae.printStackTrace();
        }

    }
}
