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
public class Main {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] data = {{45,78,7,200,80}, {90,1,17,100,50}, {21,2,40,18,65}};
        Pencarian pcr = new Pencarian(data, 3, 5);
        
        System.out.println("=======================================================");
        System.out.println("     Program pencarian data pada array dua dimensi     ");
        System.out.println("=======================================================");
        System.out.println("Isi Array : ");
        System.out.println("-------------------------------------------------------");
        pcr.TampilData();
        System.out.println("=======================================================");
        
        System.out.print("Masukkan data yang Anda dicari : ");
        int cari = sc.nextInt();
        
        int[] posisi = pcr.FindSeqSearch(cari);
        pcr.Tampilposisi(cari, posisi);
        System.out.println("-------------------------------------------------------");
        System.out.println("     TERIMA KASIH TELAH MENGGUNAKAN PROGRAM INI        ");
        System.out.println("=======================================================");
    }
}
