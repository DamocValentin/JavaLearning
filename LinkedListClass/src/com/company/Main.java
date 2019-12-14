package com.company;


public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.contains(20);
        list.indexOf(30);
        list.deleteFirst();
        list.deleteLast();
        list.addFirst(30);
        list.addLast(10);
    }
}
