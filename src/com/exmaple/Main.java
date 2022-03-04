package com.exmaple;

import com.exmaple.Hashing.Data;
import com.exmaple.Hashing.Hashmap;

public class Main {
    public static void main(String[] args) {
        Hashmap hashmap = new Hashmap();

        hashmap.print();
        hashmap.put("abc", new Data(3));
        hashmap.print();
        hashmap.put("abd", new Data(4));
        hashmap.print();
        hashmap.put("abe", new Data(5));
        hashmap.print();
        hashmap.put("abf", new Data(6));
        hashmap.print();

        System.out.println("Val at 'abd': " + hashmap.get("abd") + "\n");
        hashmap.print();

    }
}
