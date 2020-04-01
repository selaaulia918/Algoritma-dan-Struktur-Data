/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class KalimatTerbalikMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String kalimatAwal;
        System.out.println("==============================================");
        System.out.println("|PROGRAM MEMBALIK KALIMAT DENGAN KONSEP STACK|");
        System.out.println("==============================================");
        System.out.println("Masukkan Kalimat : ");
        kalimatAwal = sc.nextLine();
        System.out.println("----------------------------------------------");
        Stack pembalik = new Stack(kalimatAwal);
        
        pembalik.exchange();
        pembalik.show();
        System.out.println("==============================================");
        System.out.println("| TERIMA KASIH TELAH MENGGUNAKAN PROGRAM INI |");
        System.out.println("==============================================");
    }
}
