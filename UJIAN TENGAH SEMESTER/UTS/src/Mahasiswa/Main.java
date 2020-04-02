/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        MahasiswaBerprestasi data = new MahasiswaBerprestasi();
        int jumMhs = 5;

        System.out.println("=============================================================");
        System.out.println("|                DAFTAR NILAI MAHASISWA                     |");
        System.out.println("=============================================================");
        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama        = ");
            String nama = s1.nextLine();
            System.out.print("Tahun Masuk = ");
            int thn = s.nextInt();
            System.out.print("Umur        = ");
            int umur = s.nextInt();
            System.out.print("IPK         = ");
            double ipk = s.nextDouble();
            System.out.println("---------------------------------------------------------------");

            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);
        }
        System.out.println("===============================================================");
        System.out.println("| DATA MAHASISWA DIURUTKAN DENGAN BUBBLE SORT BERDASARKAN IPK |");
        System.out.println("===============================================================");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("===============================================================");
        System.out.println("|             CARI DATA MAHASISWA DENGAN IPK                  |");
        System.out.println("===============================================================");
        double cari;
        System.out.println("Masukkan data yang ingin dicari : ");
        cari = s.nextDouble();
        data.FindBinarySearch(cari, jumMhs, jumMhs);
    }
}
