/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu1;

import minggu2.Barang;

/**
 *
 * @author Sela Aulia Siswanto
 */
public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        
        b1.namaBarang  = "Consair 2 GB";
        b1.jenisBarang = "DDR";
        b1.stok        = 10;
        b1.hargaSatuan = 250000;
        
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();
        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah    = " + hargaTotal);
        
        Barang b2 = new Barang ("Logitech", "Wireless mouse", 150000, 25);
        b2.tampilBarang();
        
        Barang b3 = new Barang ("Asus", "Laptop", 7500000, 1);
        b3.tampilBarang();
    }
}
