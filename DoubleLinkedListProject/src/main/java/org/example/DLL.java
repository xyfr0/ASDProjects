package org.example;

public class DLL {
    Node head, tail;
    int size = 0;

    void inisialisasi() {
        head = null;
    }

    boolean isEmpty() {
        return (size == 0);
    }

    int size() {
        return size;
    }

    void addFirst(Node input) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            input.next = head;
            head.prev = input;
            head = input;
        }
        size++;
    }

    void addLast(Node input) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else {
            input.prev = tail;
            tail.next = input;
            tail = input;
        }
        size++;
    }

    void deleteFirst() {
        if (isEmpty()) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    void deleteLast() {
        if (isEmpty()) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }


    void insertAfter(Node input, int position) {
        if (isEmpty()) {
            head = input;
            tail = input;
        } else  {
            Node current = head;
            while (position-- > 0) {
                current = current.next;
            }
            current.next = input;
            input.prev = current;
            input.next = current;
            current.prev = input;
        }
        size++;
    }

    void searchNode(int position) {
        if (isEmpty()) {
            head = tail = null;
        } else {
            Node current = head;
            while (position-- > 0) {
                current = current.next;
            }
            System.out.println(current);
        }
    }

    void print() {
        Node current = head;
        for (int i = 0; i < size; i++) {
            System.out.println(current);
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        DLL list = new DLL();
        System.out.println("head : " + list.head);
        System.out.println("tail : " + list.tail);
        list.addLast(new Node());
        System.out.println("head : " + list.head);
        System.out.println("tail : " + list.tail);
        list.addLast(new Node());
        System.out.println("head : " + list.head);
        System.out.println("tail : " + list.tail);
        list.addFirst(new Node());
        System.out.println("head : " + list.head);
        System.out.println("tail : " + list.tail);

        list.print();

        list.insertAfter(new Node(), 1);
        list.print();



        list.searchNode(1);




    }


}

