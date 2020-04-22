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
public class MainStack {

    public static void main(String[] args) {
        LinkedLists data = new LinkedLists();
        System.out.println("===============================================");
        System.out.println("     Inisialisasi Stack & Linked Lists         ");
        System.out.println("===============================================");
        System.out.println("Data dimasukkan dalam source code");
        data.push(80);
        data.push(45);
        data.push(21);
        System.out.println("Tampilkan Stack");
        data.print();
        System.out.println("Hapus Stack dari Top");
        while (!data.isEmpty()) {
            NodeStack ns = data.pop();
            System.out.print("Hapus");
            ns.tampil();
            System.out.println("");
        }
        data.print();
    }
}
