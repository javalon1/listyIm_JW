package com.sda.algorytmy;

import java.util.Arrays;

public class LinkedListImpl<E> implements MyList<E> {
    private Node head;
    private int size = 0;

    public LinkedListImpl() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e) {

        if (size == 0) {
            head = new Node(e);
        } else {
            Node tmp = head;
            head = new Node(e);
            head.next = tmp;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    class Node {
        public Node(Node next, Object data) {
            this.data = data;
        }

        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }
}

