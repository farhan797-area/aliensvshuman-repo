package com.jspiders.programspatterns;

public class Mainclass2 {
    public static void main(String[] args) {
        int n = 3;
        for (int row = 1; row <= n; row++) {
            int a = row+1;
            for (int col = 1; col <= n * 2 - 1; col++) {
                if (row + col >= n + 1 && col - row <= n - 1) {
                    if (col <= n) {
                        a--;
                        System.out.print(a + " ");

                    } else {
                        a++;
                        System.out.print(a + " ");
                    }

                }
                else{
                    System.out.println();
                }



            }

        }


    }

}