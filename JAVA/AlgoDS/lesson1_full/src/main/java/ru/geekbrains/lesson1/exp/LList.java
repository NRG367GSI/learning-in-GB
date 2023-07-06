package ru.geekbrains.lesson1.exp;

class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }

    public int getVal() {
        return val;
    }
}

public class LList {
    public Node head;

    public LList() {
        this.head = null;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Node search(int val) {
        Node current = head;
        while (current != null) {
            if (current.val == val) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}