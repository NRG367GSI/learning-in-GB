package ru.geekbrains.lesson1.exp;

public class newList {

    public Nod head;


    public newList() {
        this.head = null;

    }

    public static class Nod {
        public static Integer val;
        static Nod link;

        Nod(Integer val) {
            this.val = val;
            this.link = null;

        }

    }


    public void addNod(int val) {
        Nod newNod = new Nod(val);
        if (this.head.link == null) {
            head = newNod;
        } else {
            while (head != null) {
//                Nod.val = val;
//                Nod.link = newNod;
                head = head.link;
                addNod(val);
            }

        }
    }



    public void printList() {
        Nod current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.link;
        }
        System.out.println();


    }
}

