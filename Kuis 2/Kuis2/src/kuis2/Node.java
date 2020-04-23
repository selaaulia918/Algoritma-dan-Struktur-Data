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
public class Node {
    public double data1, data2, data3;
    Node next;
    
    public Node (double data1, double data2, double data3, Node next){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.next = next;
    }
}
