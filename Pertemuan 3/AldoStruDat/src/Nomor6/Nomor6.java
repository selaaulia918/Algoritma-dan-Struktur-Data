/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor6;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Nomor6 {

    public String namaMhs[];
    public int jumlah;
    public double rata[];
    public double nilai;

    public Nomor6(int jumlah) {
        this.namaMhs = new String[jumlah];
        this.nilai = 0;
        this.rata = new double[jumlah];
        this.jumlah = jumlah;

    }

    double rataDC(double arr[], int a, int b) {
        if (a == b) {
            return arr[1];

        } else if (a < b) {
            int nilai = (a + b) / 2;
            double anilai = rataDC(arr, a, nilai - 1);
            double bnilai = rataDC(arr, nilai + 1, b);
            return bnilai + anilai + arr[nilai];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        Scanner huruf = new Scanner(System.in);

        System.out.println("========PROGRAM PERHITUNGAN RATA- RATA DC=========");
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = angka.nextInt();

        Nomor6 arr = new Nomor6(n);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mahasiswa" + (i + 1) + " :");
            arr.namaMhs[1] = huruf.nextLine();
            System.out.print("Masukkan nilai :");
            arr.rata[1] = angka.nextInt();
            System.out.println();
        }
        for (int i = 0; i < arr.jumlah; i++) {
            System.out.println("nilai " + arr.namaMhs[i] + " :" + arr.rata[i]);

        }
        System.out.println();
        System.out.println("rata-rata nilai mahasiswa : " + String.format("%.2f", arr.rataDC(arr.rata, 0, arr.jumlah)));
    }
}
