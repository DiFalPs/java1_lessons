package ru.geekbrains.jalgoritmi.lessons;

public class DLLIterator {
    private Node currrent;
    private DoubleLinkedList list;

    public DLLIterator(DoubleLinkedList list) {
        this.list = list;
        this.currrent = list.getHead();
    }

    public void reset() {
        currrent = this.list.getHead();
    }

    public void resetEnd() {
        currrent = this.list.getTail();
    }

    public Node next() {
        Node temp = currrent;
        if (currrent != null) {
            currrent = currrent.next;
        }
        return temp;
    }

    public Node previous() {
        Node temp = currrent;
        if (currrent != null) {
            currrent = currrent.previous;
        }
        return temp;
    }

    public Node getCurrent() {
        return currrent;
    }

    public void insertBefore(Cat c) {
        Node node = new Node(c);
        if (currrent == null) {
            currrent = node;
            this.list.setTail(node);
            this.list.setHead(node);
            return;
        }
        if (currrent.previous == null) {
            currrent.previous = node;
            node.next = currrent;
            this.list.setHead(node);
        } else {
            Node prev = currrent.previous;
            prev.next = node;
            node.previous = prev;
            node.next = currrent;
            currrent.previous = node;
        }
    }

    public boolean atEnd() {
        return (currrent == null || currrent.next == null);
    }

    public boolean atStart() {
        return (currrent == null || currrent.previous == null);
    }

    public void insertAfter(Cat c) {
        Node n = new Node(c);
        if (currrent == null) {
            currrent = n;
            this.list.setTail(n);
            this.list.setHead(n);
            return;
        }
        if (currrent.next == null) {
            currrent.next = n;
            n.previous = currrent;
            this.list.setTail(n);
        } else {
            Node next = currrent.next;
            next.previous = n;
            n.next = next;
            n.previous = currrent;
            currrent.next = n;
        }
    }

    public void deleteCurrent() {
        if (currrent == null) return;
        if (currrent.previous == null && currrent.next == null) {
            currrent = null;
            this.list.setHead(currrent);
            this.list.setTail(currrent);
        } else if (currrent.previous == null) {
            currrent = currrent.next;
            currrent.previous = null;
            this.list.setHead(currrent);
        } else if (currrent.next == null) {
            currrent = currrent.previous;
            currrent.next = null;
            this.list.setTail(currrent);
        } else {
            Node next = currrent.next;
            Node prev = currrent.previous;
            prev.next = next;
            next.previous = prev;
            currrent = prev;
        }
    }
}
