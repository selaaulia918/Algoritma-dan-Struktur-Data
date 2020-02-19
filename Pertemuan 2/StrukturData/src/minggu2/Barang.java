/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author Sela Aulia Siswanto
 */
public class Barang {
    public String namaBarang, jenisBarang;
    public int stok, hargaSatuan;
    
    public Barang(){
        
    }
    public Barang (String nm, String jn, int st, int hs){
        namaBarang  = nm;
        jenisBarang = jn;
        stok        = st;
        hargaSatuan = hs;
    }
    public void tampilBarang(){
        System.out.println("Nama            = " + namaBarang);
        System.out.println("Jenis           = " + jenisBarang);
        System.out.println("Stok            = " + stok);
        System.out.println("Harga satuan    = " + hargaSatuan);
    } 
    public void tambahStok (int n){
        stok = stok + n;
    } 
    public void kurangiStok (int n){
        stok = stok - n;
    }
    public int hitungHargaTotal (int jumlah){
        return jumlah * hargaSatuan;
    }
}
