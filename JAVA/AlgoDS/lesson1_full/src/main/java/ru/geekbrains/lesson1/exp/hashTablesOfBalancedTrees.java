package ru.geekbrains.lesson1.exp;


import java.util.TreeMap;

class  main{
    public static void main(String[] args) {
        hashTablesOfBalancedTrees<Integer, String> map = new hashTablesOfBalancedTrees<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map.get(1)); // Output: One
        map.remove(2);
        System.out.println(map.get(2)); // Output: null
    }
}

public class hashTablesOfBalancedTrees<K extends Comparable<K>, V> {
    private TreeMap<K, V>[] data;
    private int size;
    private int capacity;
    private final double loadFactor = 0.75;

    public hashTablesOfBalancedTrees() {
        this(16);
    }

    public hashTablesOfBalancedTrees(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        data = new TreeMap[capacity];
        for (int i = 0; i < capacity; i++) {
            data[i] = new TreeMap<>();
        }
    }

    private int hash(K key) {
        return key.hashCode() & 0x7fffffff % capacity;
    }

    private void resize(int newCapacity) {
        TreeMap<K, V>[] newData = new TreeMap[newCapacity];
        for (int i = 0; i < newCapacity; i++) {
            newData[i] = new TreeMap<>();
        }
        int oldCapacity = capacity;
        capacity = newCapacity;
        for (int i = 0; i < oldCapacity; i++) {
            TreeMap<K, V> map = data[i];
            for (K key : map.keySet()) {
                newData[hash(key)].put(key, map.get(key));
            }
        }
        data = newData;
    }

    public void put(K key, V value) {
        if (size >= loadFactor * capacity) {
            resize(capacity * 2);
        }
        TreeMap<K, V> map = data[hash(key)];
        if (!map.containsKey(key)) {
            size++;
        }
        map.put(key, value);
    }

    public V get(K key) {
        TreeMap<K, V> map = data[hash(key)];
        return map.get(key);
    }

    public void remove(K key) {
        TreeMap<K, V> map = data[hash(key)];
        if (map.containsKey(key)) {
            size--;
            map.remove(key);
        }
        if (capacity > 16 && size < loadFactor * capacity / 4) {
            resize(capacity / 2);
        }
    }
}
