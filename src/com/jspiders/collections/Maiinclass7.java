package com.jspiders.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Maiinclass7 {
    public static void main(String[] args) {
        Hashtable <Integer, String>ht = new Hashtable<Integer,String>();
        System.out.println("HASHTABLE----------------");
        ht.put(1,"a");
        ht.put(2,"b");
        ht.put(3,"c");
        ht.put(4,"d");
        ht.put(5,"e");
        System.out.println(ht);



        System.out.println("HASHMAP------------------");
        HashMap<Integer, String> hm = new HashMap<Integer,String>();
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        hm.put(4,"d");
        hm.put(5,"e");
        System.out.println(hm);

        System.out.println("TREEMAP-----------------");
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1,"a");
        tm.put(2,"b");
        tm.put(3,"c");
        tm.put(4,"d");
        tm.put(5,"e");
        System.out.println(tm);


        System.out.println("LINKEDHASHMAP------------");
        LinkedHashMap<Integer,String> ll = new LinkedHashMap<Integer,String>();
        ll.put(1,"a");
        ll.put(2,"b");
        ll.put(3,"c");
        ll.put(4,"d");
        ll.put(5,"e");
        System.out.println(ll);
    }
}
