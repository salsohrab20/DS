package com.practice.linked_list;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtNPosition(int position, int val) {
        Node temp = head;
        int index = 0;
        while (index < position - 1) {
            temp = temp.next;
            index++;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
    }

    public void reverse() {

    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
