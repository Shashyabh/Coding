package com.OraclePrep;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {

    int cap;
    LinkedList<Integer> order;
    HashMap<Integer, Integer> cache;

    public LRUCache(int cap) {
        this.cap = cap;
        this.order = new LinkedList<>();
        this.cache = new HashMap<>();
    }

    public int get(int page) {
        if (cache.containsKey(page)) {
            order.remove((Integer) page);
            order.addFirst(page);
            return cache.get(page);
        } else {
            return -1;
        }
    }

    public void put(int page, int value) {
        if (cache.size() >= cap) {
            int removeLast = order.removeLast();
            cache.remove(removeLast);
        }
        cache.put(page, value);
        order.addFirst(page);
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);

        lruCache.put(1, 10);
        lruCache.put(2, 20);
        lruCache.put(3, 30);

        System.out.println(lruCache.get(2)); // Output: 20

        lruCache.put(4, 40);
        lruCache.put(5, 50);

        System.out.println(lruCache.get(1)); // Output: -1 (1 is removed due to capacity constraint)
    }
}
