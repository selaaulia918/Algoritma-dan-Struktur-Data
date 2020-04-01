/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PrefixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String D, C;
        
        System.out.println("====================================================");
        System.out.println("|      PROGRAM KONVERSI INFIX MENJADI PREFIX        |");
        System.out.println("====================================================");
        System.out.println("Masukkan ekspresi matematika: ");
        C = sc.nextLine();
        int length = C.length();
        
        String Balik = "";
        for (int i = length-1; i >= 0; i--) {
            Balik = Balik + C.charAt(i);
        }

        Balik = Balik.trim();
        Balik = Balik + "(";
        
        int total = Balik.length();
        
        Prefix pre = new Prefix(total);
        D = pre.konversi(Balik);
        System.out.println("Prefix: " + new StringBuffer(D).reverse());
        System.out.println("====================================================");
        System.out.println("|    TERIMA KASIH TELAH MENGGUNAKAN PROGRAM INI     |");
        System.out.println("====================================================");
    }
}
