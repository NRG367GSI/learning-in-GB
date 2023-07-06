package ru.geekbrains.lesson1.exp;


import java.util.LinkedList;

public class HashTableDinamicSize {
    private final int INITIAL_CAPACITY = 8;
    private LinkedList<Integer>[] table;

    public HashTableDinamicSize() {
        table = new LinkedList[INITIAL_CAPACITY];
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            table[i] = new LinkedList<Integer>();
        }
    }

    private int hash(int key) {
        return key % INITIAL_CAPACITY;
    }

    public void add(int key) {
        int index = hash(key);
        table[index].add(key);
    }

    public boolean contains(int key) {
        int index = hash(key);
        return table[index].contains(key);
    }

    public static void main(String[] args) {
        HashTableDinamicSize table = new HashTableDinamicSize();
        table.add(5);
        table.add(9);
        table.add(13);
        table.add(5);
        table.add(9);
        table.add(13);
        table.add(5);
        table.add(9);
        table.add(13);
        table.add(5);
        table.add(9);
        table.add(13);
        table.add(5);
        table.add(9);
        table.add(13);
        table.add(5);
        table.add(9);
        table.add(13);
        System.out.println(table.contains(9)); // выводит true
        System.out.println(table.contains(6)); // выводит false
    }
}


