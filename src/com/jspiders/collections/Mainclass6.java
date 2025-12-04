package com.jspiders.collections;

import java.util.PriorityQueue;

public class Mainclass6 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(10);
        pq.add(30);
        pq.add(4);
        pq.add(50);
        pq.add(60);
        pq.add(70);

        while(pq.isEmpty()==false){
            System.out.println(pq.poll());
        }
    }
}
