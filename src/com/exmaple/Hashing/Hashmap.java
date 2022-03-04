package com.exmaple.Hashing;

public class Hashmap {
    private final int tabSize = 7;
    private final Entry[] hashmap = new Entry[tabSize];

    public void put(String key, Data data) {
        int hash = Hashmap.hash(key) % this.tabSize;
        int d = -tabSize;

        while (hashmap[hash] != null) {
            d += 2;
            hash = (hash + Math.abs(d)) % tabSize;
        }

        hashmap[hash] = new Entry(key, data);
    }

    public Data get(String key) {
        int hash = Hashmap.hash(key) % this.tabSize;
        int d = -tabSize;

        while (hashmap[hash] != null && hashmap[hash].key.equals(key) && d <= tabSize) {
            d += 2;
            hash = (hash + Math.abs(d)) % tabSize;
        }

        if (hashmap[hash] != null)
            return hashmap[hash].data;
        else return null;
    }

    public void delete(String key) {
        int hash = Hashmap.hash(key) % this.tabSize;
        int d = -tabSize;

        while (hashmap[hash].key.equals(key)) {
            d += 2;
            hash = (hash + Math.abs(d)) % tabSize;
        }

        hashmap[hash] = null;
    }

    public void print() {
        System.out.println("[");
        for (Entry hashEntry : hashmap) {
            if (hashEntry != null)
                System.out.println(hashEntry);
            else System.out.println("null");
        }
        System.out.println("]\n");
    }

    static int hash(String key) {
        return key.length();
    }

    private static class Entry {
        String key;
        Data data;

        Entry(String key, Data data) {
            this.key = key;
            this.data = data;
        }

        public String toString() {
            return "Key: " + this.key + ", Data: " + this.data.toString();
        }
    }
}
