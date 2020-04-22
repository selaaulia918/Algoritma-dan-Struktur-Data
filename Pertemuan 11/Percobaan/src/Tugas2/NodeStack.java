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
public class NodeStack {

    public int data;
    public NodeStack next;
    public NodeStack prev;

    public NodeStack(int id) {
        this.data = id;
    }

    public void tampil() {
        System.out.println("{" + data + "}");
    }
}
