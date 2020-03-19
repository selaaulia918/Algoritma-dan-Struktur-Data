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
public class Main {

    public static void main(String[] args) {
        int data[] = {10, 30, 40, 50, 60, 70, 80, 90};
        Searching pencarian = new Searching(data, 8);
        System.out.println("Sorting dengan merge sort");
        MergeSortTest.MergeSorting mSort = new MergeSortTest.MergeSorting();
        System.out.println("data awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("setelah diurutkan");
        mSort.printArray(data);

        int cari = 30;
        System.out.println("Menggunakan sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        if (posisi != -1) {
            System.out.println("data : " + cari + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
        System.out.println("=====================================");
        System.out.println("menggunakan Binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length - 1);  
        pencarian.Tampilposisi(cari, posisi);

    }
}
