package org.example.DataStructures;

import org.example.DataStructures.LinkedList.DoublyLL;
import org.example.DataStructures.LinkedList.LL;

public class Main {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(9);
        list.insertFirst(22);
        list.display();
    }
}
