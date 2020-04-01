/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Asus
 */
public class StackMain {
    public static void main(String[] args) {
        Stack tumpukan = new Stack(4);
        
        System.out.println("=========================================================");
        System.out.println("Modifikasi Praktikum 1 mengubah data angka menjadi teks");
        System.out.println("=========================================================");
        tumpukan.push("|\tBuku tulis                                       |");
        tumpukan.push("|\tPenggaris                                        |");
        tumpukan.push("|\tPenghapus                                        |");
        tumpukan.push("|\tBolpoint                                         |");
        
        tumpukan.print();
        System.out.println("---------------------------------------------------------");
        
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
        System.out.println("---------------------------------------------------------");
        System.out.println("         TERIMA KASIH TELAH MENGGUNAKAN SISTEM INI       ");
        System.out.println("=========================================================");
    }
}
