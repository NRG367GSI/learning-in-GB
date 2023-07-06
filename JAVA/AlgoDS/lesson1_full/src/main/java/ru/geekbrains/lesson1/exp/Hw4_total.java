package ru.geekbrains.lesson1.exp;

class Hw4_total {
    public static void main(String[] args) {
        RedBlackTree<Integer, String> tree = new RedBlackTree<>();

// Добавление элементов в дерево
        tree.add(3, "value 3");
        tree.add(5, "value 5");
        tree.add(2, "value 2");
        tree.add(1, "value 1");
        tree.add(4, "value 4");
        tree.printTree();

// Поиск элемента в дереве
        String value = tree.get(2);
        System.out.println(value);  // "value 2"

// Удаление элемента из дерева
        tree.delete(4);
        tree.printTree();

    }
}
class RedBlackTree<K extends Comparable<K>, V> {

    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private static class Node<K, V> {
        K key;
        V value;
        boolean color;
        Node<K, V> left;
        Node<K, V> right;
        Node<K, V> parent;

        Node(K key, V value, boolean color, Node<K, V> parent) {
            this.key = key;
            this.value = value;
            this.color = color;
            this.left = null;
            this.right = null;
            this.parent = parent;
        }
    }

    private Node<K, V> root;

    // Конструктор дерева
    public RedBlackTree() {
        this.root = null;
    }

    // Добавление элемента в дерево
    public void add(K key, V value) {
        this.root = add(this.root, key, value, null);
        this.root.color = BLACK;
    }

    // Вспомогательный метод добавления элемента
    private Node<K, V> add(Node<K, V> node, K key, V value, Node<K, V> parent) {
        if (node == null) {
            return new Node<>(key, value, RED, parent);
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = add(node.left, key, value, node);
        } else if (cmp > 0) {
            node.right = add(node.right, key, value, node);
        } else {
            node.value = value;
        }

        // Проверяем и восстанавливаем баланс дерева
        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }

        return node;
    }

    // Поиск элемента в дереве по ключу
    public V get(K key) {
        Node<K, V> node = get(this.root, key);
        return node == null ? null : node.value;
    }

    // Вспомогательный метод поиска элемента
    private Node<K, V> get(Node<K, V> node, K key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return get(node.left, key);
        } else if (cmp > 0) {
            return get(node.right, key);
        } else {
            return node;
        }
    }

    // Удаление элемента из дерева
    public void delete(K key) {
        this.root = delete(this.root, key);
        if (this.root != null) {
            this.root.color = BLACK;
        }
    }

    // Вспомогательный метод удаления элемента
    private Node<K, V> delete(Node<K, V> node, K key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = delete(node.left, key);
        } else if (cmp > 0) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            Node<K, V> temp = node;
            node = min(temp.right);
            node.right = deleteMin(temp.right);
            node.left = temp.left;
        }

        // Восстанавливаем баланс дерева
        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }

        return node;
    }

    // Поиск минимального элемента в поддереве
    private Node<K, V> min(Node<K, V> node) {
        if (node.left == null) {
            return node;
        } else {
            return min(node.left);
        }
    }

    // Удаление минимального элемента из поддерева
    private Node<K, V> deleteMin(Node<K, V> node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        return node;
    }

    // Замена значения элемента в дереве
    public void replace(K key, V newvalue) {
        Node<K, V> node = get(this.root, key);
        if (node != null) {
            node.value = newvalue;
        }
    }

    // Проверка цвета узла
    private boolean isRed(Node<K, V> node) {
        return node != null && node.color == RED;
    }

    // Поворот узла вправо
    private Node<K, V> rotateRight(Node<K, V> node) {
        Node<K, V> x = node.left;
        node.left = x.right;
        x.right = node;
        x.color = x.right.color;
        x.right.color = RED;
        return x;
    }

    // Поворот узла влево
    private Node<K, V> rotateLeft(Node<K, V> node) {
        Node<K, V> x = node.right;
        node.right = x.left;
        x.left = node;
        x.color = x.left.color;
        x.left.color = RED;
        return x;
    }

    // Перекрашивание узлов
    private void flipColors(Node<K, V> node) {
        node.color = !node.color;
        node.left.color = !node.left.color;
        node.right.color = !node.right.color;
    }

    // Вывод элементов дерева
    public void printTree() {
        printTree(this.root);
    }

    // Вспомогательный метод для вывода элементов дерева
    private void printTree(Node<K, V> node) {
        if (node != null) {
            printTree(node.left);
            System.out.println(node.key + " : " + node.value + " : " + node.color);
            printTree(node.right);
        }
    }
}

