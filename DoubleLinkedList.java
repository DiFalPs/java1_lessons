package ru.geekbrains.jalgoritmi.lessons;

public class DoubleLinkedList {
    private Node head;
    private Node tail;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void pushHead(Cat c) {
        Node n = new Node(c);
        if (!isEmpty()) {
            head.previous = n;
            n.next = head;
            head = n;
        } else {
            head = n;
            tail = n;
        }
    }

    public void pushTail(Cat c) {
        Node n = new Node(c);
        if (!isEmpty()) {
            tail.next = n;
            n.previous = tail;
            tail = n;
        } else {
            head = n;
            tail = n;
        }
    }

    public Cat popHead() {
        if (isEmpty()) return null;
        Cat temp = head.c;
        head = head.next;
        head.previous = null;
        return temp;
    }

    public Cat popTail() {
        if (isEmpty()) return null;
        Cat temp = tail.c;
        tail = tail.previous;
        tail.next = null;
        return temp;
    }

    public DLLIterator getIterator() {
        return new DLLIterator(this);
    }

    public boolean contains(Cat c) {
        Node n = new Node(c);
        if (isEmpty()) return false;
        DLLIterator itr = new DLLIterator(this);
        Node cur;
        while ((cur = itr.next()) != null) {
            if (cur.equals(n)) return true;
        }
        return false;
    }

    public boolean delete(Cat c) {
        Node n = new Node(c);
        if (isEmpty()) return false;
        DLLIterator dllIterator = new DLLIterator(this);
        Node current;
        while ((current = dllIterator.getCurrent()) != null) {
            if (current.equals(n)) {
                dllIterator.deleteCurrent();
                return true;
            } else {
                dllIterator.next();
            }
        }
        return false;
    }
}
