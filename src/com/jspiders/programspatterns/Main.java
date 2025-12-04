package com.jspiders.programspatterns;

public class Main {

//    static class parent {
//        static void show(){
//            System.out.println("Parent show");
//        }
//    }
//    static class child extends parent{
//        static void show1(){
//            System.out.println("child show");
//        }
//    }

    public static void main(String[] args) {
        String s1= "java";
        String s2= new String("Java");
        System.out.println(s1.hashCode()==s2.hashCode());
        String s3="java";
        System.out.println(s1.hashCode()==s3.hashCode());
        System.out.println(s2);

//        parent p1 = new parent();
//        child c1 = new child();
//        p1.show();
//        c1.show1();



    }
}
