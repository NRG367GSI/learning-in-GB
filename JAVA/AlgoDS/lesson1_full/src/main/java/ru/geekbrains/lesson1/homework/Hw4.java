package ru.geekbrains.lesson1.homework;

public class Hw4 {
    public static void main(String[] args) {
        RedBlackTreeBalanced<Integer> tree = new RedBlackTreeBalanced<Integer>();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(8);
        System.out.println("Before remove:");
        tree.print();
        System.out.println("After remove:");
        tree.print();
    }


    }

    class RedBlackTreeBalanced<V extends Comparable<V>> {

        private Node root;
        private static final boolean RED = true;
        private static final boolean BLACK = false;

        private class Node {
            private V value;
            private Node left;
            private Node right;
            private boolean color;
            private int size;

            public Node(V value, boolean color, int size) {
                this.value = value;
                this.color = color;
                this.size = size;
            }
        }


        private boolean contains(Node node, V value) {
            if (node.value.equals(value)) {
                return true;
            } else {
                if (node.value.compareTo(value) > 0) {
                    return contains(node.left, value);
                } else {
                    return contains(node.right, value);
                }
            }
        }

        public void add(V value) {
            root = add(root, value);
            root.color = BLACK;
        }

        private Node add(Node node, V value) {
            if (node == null) {
                return new Node(value, RED, 1);
            }

            if (node.value.compareTo(value) > 0) {
                node.left = add(node.left, value);
            } else if (node.value.compareTo(value) < 0) {
                node.right = add(node.right, value);
            } else {
                node.value = value;
            }

            if (isRed(node.right) && !isRed(node.left)) {
                node = rotateLeft(node);
            }
            if (isRed(node.left) && isRed(node.left.left)) {
                node = rotateRight(node);
            }
            if (isRed(node.left) && isRed(node.right)) {
                flipColors(node);
            }

            node.size = size(node.left) + size(node.right) + 1;

            return node;
        }

        private Node rotateLeft(Node node) {
            Node x = node.right;
            node.right = x.left;
            x.left = node;
            x.color = node.color;
            node.color = RED;
            x.size = node.size;
            node.size = size(node.left) + size(node.right) + 1;
            return x;
        }

        private Node rotateRight(Node node) {
            Node x = node.left;
            node.left = x.right;
            x.right = node;
            x.color = node.color;
            node.color = RED;
            x.size = node.size;
            node.size = size(node.left) + size(node.right) + 1;
            return x;
        }

        private void flipColors(Node node) {
            node.color = RED;
            node.left.color = BLACK;
            node.right.color = BLACK;
        }

        private int size(Node node) {
            if (node == null) {
                return 0;
            }
            return node.size;
        }

        private boolean isRed(Node node) {
            if (node == null) {
                return false;
            }
            return node.color == RED;
        }

        public void print() {
            if (root == null) {
                System.out.println("Tree is empty");
            } else {
                print(root);
            }
        }

        private void print(Node node) {
            if (node != null) {
                print(node.left);
                System.out.println(node.value + " " + (node.color == RED ? "RED" : "BLACK"));
                print(node.right);
            }
        }
    }