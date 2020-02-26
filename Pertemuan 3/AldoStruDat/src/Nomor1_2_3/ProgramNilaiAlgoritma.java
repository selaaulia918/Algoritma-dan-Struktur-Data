/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1_2_3;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ProgramNilaiAlgoritma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============PENILAIAN MAHASISWA===================");
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();
        System.out.println("----------------------------------------------------");
        NilaiAlgoritma[] na = new NilaiAlgoritma[jumlah];
        for (int i = 0; i < jumlah; i++) { 
            na[i] = new NilaiAlgoritma();
            System.out.print("Nama Mahasiswa ke-" + (i + 1) + " : ");
            na[i].namaMhs = sc.next();
            System.out.println("----------------------------------------------------");
            System.out.println("Masukkan nilai-nilai Mahasiswa ke-" + (i + 1));
            System.out.print("Nilai Tugas : ");
            na[i].nilaiTugas = sc.nextInt();
            System.out.print("Nilai Kuis  : ");
            na[i].nilaiKuis = sc.nextInt();
            System.out.print("Nilai UTS   : ");
            na[i].nilaiUTS = sc.nextInt();
            System.out.print("Nilai UAS   : ");
            na[i].nilaiUAS = sc.nextInt();
            System.out.println("----------------------------------------------------");
            System.out.println("Nilai Akhir Mahasiswa ke-" + (i + 1) + ": " + na[i].hitungTotalNilai(na[i].nilaiTugas, na[i].nilaiKuis, na[i].nilaiUTS, na[i].nilaiUAS));
            System.out.println("----------------------------------------------------");
        }
        Rata2 ra = new Rata2();
        System.out.println("============Rata-Rata Nilai Semua Mahasiswa============");
        for (int i = 0; i < jumlah; i++){
            System.out.println("Nama Mahasiswa ke-" + (i + 1) + " : " + na[i].namaMhs);
            System.out.println("Nilai total         : "+na[i].hitungTotalNilai(na[i].nilaiTugas, na[i].nilaiKuis, na[i].nilaiUTS, na[i].nilaiUAS) );
            ra.total += na[i].hitungTotalNilai(na[i].nilaiTugas, na[i].nilaiKuis, na[i].nilaiUTS, na[i].nilaiUAS);
        }
        System.out.println("--------------------------------------------------------");
        System.out.print("Rata-rata nilai Mahasiswa : " + ra.hitungRata(jumlah));
    }
}
  