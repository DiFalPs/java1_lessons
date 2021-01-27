package ru.geekbrains.jalgoritmi.lessons;

public class CatsIterator {
    private Node current;
    private SingleLinkedList list;

    public CatsIterator(SingleLinkedList list) {
        this.list = list;
        this.current = list.getHead();

    }

    public void reset() {
        current = this.list.getHead();
    }

    public Node next() {
        Node temp = current;
        if (current != null) {
            current = current.next;
        }
        return temp;
    }

    public Node getCurrent() {
        return current;
    }

    public boolean atEnd() {
        return (current == null || current.next == null);
    }


    public void insertBefore(Cat c) {
        Node node = new Node(c);
        Node current = list.getHead();
        Node previous = null;
        while (!current.equals(getCurrent())) {
            if (current.next == null) return;
            else {
                previous = current;
                current = current.next;
            }
        }
        if(previous == null){
            node.next = list.getHead();
            list.setFirst(node);
            reset();
        }
        else{
            node.next = previous.next;
            previous.next = node;
            current = next();
        }

    }

    public void insertAfter(Cat c) {
        Node node = new Node(c);
        if (list.isEmpty()){
            list.setFirst(node);
            current = node;
        } else {
            node.next = current.next;
            current.next = node;
            next();
        }
    }

    public void deleteCurrent() {
        if (getCurrent() == null) throw new IndexOutOfBoundsException("Ops wrong value in 'next()'");
        Node current = list.getHead();
        Node previous = null;
        while (!current.equals(getCurrent())) {
            if (current.next == null) return;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (previous == null){
            list.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()){
                reset();
            }
        }
    }

}