package ru.geekbrains.jalgoritmi.lessons;

public class SingleLinkedList {
    private Node head;


    public SingleLinkedList() {
        this.head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void push(Cat c) {
        Node n = new Node(c);
        n.next = head;
        head = n;
    }
    public Cat pop() {
        if (isEmpty()) return null;
        Cat temp = head.c;
        head = head.next;
        return temp;
    }
    public boolean contains(Cat c) {
        Node n = new Node(c);
        Node current = head;
        while (!current.equals(n)) {
            if (current.next == null) return false;
            else current = current.next;
        }
        return true;
    }
    public void delete(Cat c) {
        Node n = new Node(c);
        Node current = head;
        Node previous = null;
        while (!current.equals(n)) {
            if (current.next == null) return;
            else {
                previous = current;
                current = current.next;
            }
        }

        if (current == head) {
            head = head.next;
        } else {
            previous.next = current.next;
        }

        // return current.c

    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public CatsIterator getIterator() {
        return new CatsIterator(this);
    }

    public void setFirst(Node next) {
        this.head = next;
    }
}
