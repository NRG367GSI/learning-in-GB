package ru.geekbrains.lesson1.homework;

import ru.geekbrains.lesson1.exp.newList;

public class Hw2 {
    public static void main(String[] args) {
//        newList.Nod nod = new newList.Nod();
//        newList.Nod nod2 = new newList.Nod();
//        newList.Nod nod3 = new newList.Nod();
//        nod.val = 1;
//        nod.link = nod2;
//        nod2.val = 5;
//        nod2.link = nod3;
//        nod3.val = 9;
//        nod3.link = null;
//        System.out.println(nod.link.val);
//
//        newList list = new newList();
//        System.out.println(list.head);
//        list.head = nod;
//        System.out.println(list.head.val);

        newList list = new newList();
        list.addNod(5);
        System.out.println(list.head.val);
        list.addNod(6);
        System.out.println(list.head.val);
        list.addNod(8);
        System.out.println(newList.Nod.val);
        list.addNod(9);
        list.printList();


    }
}

class LList {
    LNode head;
    LNode tail;

    public LNode find(int value) {
        LNode currentNode = head;
        while (currentNode != null){
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return  null;
    }

    public class LNode {
        int value;
        LNode next;
        LNode previous;

        @Override
        public String toString() {
            return String.format("%d", value);
        }
    }

    public LNode findNode(int value) {
        LNode node = head;
        while (node.next.equals(node.previous)) {
            node = node.previous;
            if (node.value == value) {
                return node;
            }
        }
        return null;
    }

    public void add(int value) {
        LNode node = new LNode();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %s", head, tail);
    }


}
