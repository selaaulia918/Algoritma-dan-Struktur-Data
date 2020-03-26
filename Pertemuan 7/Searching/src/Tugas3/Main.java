/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        int[] data = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        Searching pencarian = new Searching(data, 10);
        MergeSort ms = new MergeSort();

        System.out.println("===========================================================");
        System.out.println("             Pencarian Nilai Array Terbesar                ");
        System.out.println("===========================================================");
        System.out.println("Isi Array : ");
        System.out.println("-----------------------------------------------------------");
        pencarian.TampilData();
        System.out.println("===========================================================");

        System.out.println("Sorting dengan merge sort : ");
        System.out.println("-----------------------------------------------------------");
        ms.mergeSort(data);
        ms.printArray(data);
        System.out.println("===========================================================");

        System.out.println("Nilai data Terbesar   : " + pencarian.maks(data));
        int cari = pencarian.maks(data);
        System.out.println("Jumlah nilai terbesar : " + pencarian.jumlahTerbesar(cari, data));
        System.out.println("-----------------------------------------------------------");
        int posisi[] = new int[pencarian.terbesar];
        for (int i = 0; i < pencarian.terbesar; i++) {
            posisi[i] = pencarian.FindBinarySearch(cari, data, 0, data.length - 1);
            if (i > 0) {
                pencarian.Tampilposisi(cari, posisi[i] + 1);
            } else {
                pencarian.Tampilposisi(cari, posisi[i]);
            }
        }
    }
}
