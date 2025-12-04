package com.jspiders.encapsulation;

public class Mainclass {
        public static void main(String[] args) {
            System.out.println("program starts......");
            account a1 = new account();
            double balance = a1.getBalance();
            System.out.println("balance is :"+balance);

            a1.setBalance(1000);
            balance = a1.getBalance();
            System.out.println("balance is :" +balance);

            System.out.println("program ends......");



        }

    }
