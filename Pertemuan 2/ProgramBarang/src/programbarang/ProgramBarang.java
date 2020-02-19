/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programbarang;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ProgramBarang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang brg = new Barang();
        System.out.println("============TOKO ANUGERAH===============");
        System.out.print("Masukkan Nama Pelanggan : ");
        Barang.nama = sc.nextLine();
        System.out.print("Harga Barang            : Rp ");
        Barang.hargaSatuan = sc.nextInt();
        System.out.print("jumlah barang           : ");
        Barang.jumlah = sc.nextInt();
        System.out.println("========================================");
        System.out.println("Nama                  = " + Barang.nama);
        System.out.println("Harga Satuan Barang   = " + Barang.hargaSatuan);
        System.out.println("Total item            = " + Barang.hitungHargaTotal());
        System.out.println("Diskon                = " + Barang.hitungDiskon());
        System.out.println("Total Belanja         = " + Barang.hitungHargaBayar());
        System.out.println("====TERIMA KASIH ATAS KUNJUNGAN ANDA====");
    }

}
