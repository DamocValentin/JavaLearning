package com.company;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    private boolean isEmpty(){
        return first == null;
    }

    private Node getPrevious(Node node){
        var current = first;
        while (current != null){
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public void addFirst(int value){
        var node = new Node(value);
        if (isEmpty())
            first = last = node;
        else{
            node.next = first;
            first = node;
        }
    }

    public void addLast(int value){
        var node = new Node(value);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
    }

    public void deleteFirst(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last){
            first = last = null;
            return;
        }

        var second = first.next;
        first.next = null;
        first = second;
    }

    public void deleteLast(){
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last){
            first = last = null;
            return;
        }

        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    public boolean contains(int value){
        return indexOf(value) != -1;
    }

    public int indexOf(int value){
         Node current = first;
         int index = 0;
         while ( current != null ){
             if (current.value == value){
                 return index;
             }
             index++;
             current = current.next;
         }
         return -1;
    }
}
