/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author Asus
 */
public class linkedLists {
   Node head;
    int size;

    public linkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(double data1, double data2, double data3) {
        head = new Node(data1, data2, data3, head);
        size++;
    }

    public void add(double data1, double data2, double data3) throws Exception {
        if (isEmpty()) {
            addFirst(data1, data2, data3);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(data1, data2, data3, null);
        }
        size++;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                for (int i = 0; i < 12; i++) {
                    System.out.println((i + 1) + "\t " + tmp.data1 + "\t " + tmp.data2 + "\t " + tmp.data3);
                    tmp = tmp.next;
                }
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
}
