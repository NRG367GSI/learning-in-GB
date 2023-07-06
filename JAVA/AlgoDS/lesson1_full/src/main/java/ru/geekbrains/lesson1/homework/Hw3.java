package ru.geekbrains.lesson1.homework;

public class Hw3 {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addAtHead(1);
        list.addAtTail(3);
        list.addAtIndex(1, 2);
        list.addAtHead(4);
        System.out.println(list.get(1)); // 2
        list.printList(); // 1->2->3->null
        list.reversePrint(list.head); // 3->2->1->
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        this.val = x;
    }
}

class SinglyLinkedList {
    ListNode head;


    public void addAtHead(int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head;
        head = newHead;
    }

    public void addAtTail(int val) {
        ListNode newTail = new ListNode(val);
        if (head == null) {
            head = newTail;
        } else {
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newTail;
        }
    }

    public void addAtIndex(int index, int val) {
        ListNode newNode = new ListNode(val);
        if (index == 0) {
            addAtHead(val);
        } else {
            ListNode curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    public int get(int index) {
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void printList() {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void reversePrint(ListNode curr) {
        if (curr != null) {
            reversePrint(curr.next);
            System.out.print(curr.val + "->");
        }
    }
}
