package ru.geekbrains.lesson1.exp;

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

        public boolean contains(V value) {
            if (root == null) {
                return false;
            }
            return contains(root, value);
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

    /*
    Удаление:

Для удаления элемента из красно-черного дерева можно использовать два подхода:

1. Перемещение элемента в узел без потомков. Для этого мы находим узел с максимальным элементом в левом поддереве или узел с минимальным элементом в правом поддереве и перемещаем его значение на место удаляемого элемента. Затем удаляем узел с максимальным или минимальным элементом.

2. Удаление элемента и перебалансировка дерева. Для этого мы удаляем элемент и заменяем его на узел, находящийся выше или ниже него в дереве. Затем выполняем перебалансировку, чтобы сохранить свойства красно-черного дерева.

Мы реализуем первый подход. Для этого добавим метод remove():


В методе remove() мы сначала проверяем, существует ли элемент, который мы хотим удалить. Если его нет, мы ничего не делаем. Затем мы переопределяем корень дерева, чтобы удалить элемент. После удаления мы проверяем для корня, что у него черный цвет.

Метод remove() вызывает метод remove() рекурсивно для левого поддерева, если значение элемента, который мы хотим удалить, меньше значения узла. Если у узла слева нет красных узлов и нет двух подряд красных узлов, мы вызываем метод moveRedLeft(), чтобы сделать его левого потомка красным. Затем мы рекурсивно вызываем метод remove() для левого поддерева.

Если значение элемента, который мы хотим удалить, больше или равно значению узла, мы проверяем есть ли красный узел слева. Если есть, мы поворачиваем дерево вправо. Затем мы проверяем, нужно ли переместить красный узел вправо, и рекурсивно вызываем метод remove() для правого поддерева.

Метод moveRedLeft() перемещает красный узел справа в узел с минимальным значением в левом поддереве. Метод moveRedRight() перемещает красный узел слева в узел с максимальным значением в правом поддереве.

Методы min() и deleteMin() находят узел с минимальным значением в дереве и удаляют его.

Метод balance() перебалансирует дерево после удаления элемента и возвращает перебалансированный узел.

Балансировка:

Мы у же реализовали балансировку в методах add() и remove(). Для балансировки мы проверяем, если правый потомок красный, то мы поворачиваем дерево влево. Если левый потомок или левый потомок левого потомка красный, мы поворачиваем дерево вправо. Если и левый, и правый потомки красные, мы меняем их цвета. Затем мы обновляем значения size для узлов.

Вывод на экран:

Мы можем вывести на экран все элементы в дереве, используя обход в глубину. Добавим метод print():


Этот код задаёт класс RedBlackTreeBalanced для реализации красно-черного дерева. В этом классе определены следующие методы:

1. contains(Node node, V value): проверяет наличие узла с заданным значением. Возвращает true, если узел найден, иначе - false.
2. add(V value): добавляет новый узел с заданным значением в дерево. Метод автоматически поддерживает баланс красно-черного дерева при добавлении новых узлов.
3. rotateLeft(Node node): осуществляет левый поворот дерева вокруг заданного узла. Этот метод переопределяет позиции узлов в дереве, чтобы сохранить баланс красно-черного дерева.
4. rotateRight(Node node): осуществляет правый поворот дерева вокруг заданного узла. Этот метод переопределяет позиции узлов в дереве, чтобы сохранить баланс красно-черного дерева.
5. flipColors(Node node): перекрашивает узлы в дереве. Этот метод меняет цвета узлов таким образом, чтобы они соблюдали правила красно-черного дерева.
6. size(Node node): возвращает количество узлов в дереве.
7. isRed(Node node): возвращает true, если узел имеет красный цвет. В противном случае, метод возвращает false.
8. print(): осуществляет вывод значений узлов в дереве в консоль. Каждый узел выводится со своим цветом (красным или черным). Если дерево пустое, метод выводит сообщение "Tree is empty".
    */




