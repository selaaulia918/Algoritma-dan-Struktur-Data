/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Asus
 */
public class LinkedLists {

    private NodeStack top;
    private NodeStack bottom;

    public LinkedLists() {
        top = bottom = null;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void push(int id) {
        NodeStack st = new NodeStack(id);
        if (top == null) {
            top = bottom = st;
        } else {
            top.next = st;
            st.prev = top;
            top = st;
        }
    }

    public NodeStack pop() {
        NodeStack tmp = null;
        if (top == null) {
            System.out.println("Stack Kosong");
        } else if (top == bottom) {
            tmp = top;
            top = bottom = null;
        } else {
            tmp = top;
            top = top.prev;
            top.next = null;
        }
        return tmp;
    }

    public void print() {
        NodeStack current = bottom;
        while (current != null) {
            current.tampil();
            current = current.next;
        }
        System.out.println("");

    }
}
