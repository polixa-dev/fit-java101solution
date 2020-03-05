package com.tasks3.linkedlist;

public class LinkedList {
    private Node tail;
    private Node head;
    private int size = 0;

	public LinkedList() {}

	public void add(Integer data) {
        Node newNode = new Node();
        newNode.setData(data);

        if (size == 0)
            head = newNode;
        else
            tail.setNext(newNode);

        tail = newNode;
        size++;
    }

	public Integer get(int index) {
        return find(index).getData();
    }

	public boolean delete(int index) {
        if (find(index) != null ) {

            if (index != 0)
            find(index - 1).setNext(find(index+1));
            else
                head = head.getNext();

            size--;
            return true;
        }
        return false;
    }

	public int size() {
        return size;
    }

    private Node find(int index) {
        if (index < size && index >= 0) {
            Node curNode = head;
            int curIndex = 0;
            while (curIndex < index){
                if (curNode.getNext() != null) {
                    curNode = curNode.getNext();
                    curIndex++;
                }

            }
            return curNode;
        }
        else
            return null;
    }
}
