package com.practice.linked_list.circular;

public class CLL {
    Node head;
    Node tail;
    int size;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }

    public void display(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.value+"-> ");
                temp=temp.next;
            }while(temp!=head);
        }
    }

    public void displayFromTail(){
        Node temp = tail;
        if(tail!=null){
            do{
                System.out.print(temp.value+"-> ");
                temp=temp.next;
            }while(temp!=tail);
        }
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
