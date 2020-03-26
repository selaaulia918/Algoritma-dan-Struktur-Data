/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author Asus
 */
public class CariPenduduk {
        public int jmlData;
    public DataPenduduk listPenduduk[];
    public int indeks;
    
    public CariPenduduk(int jumlah) {
        this.jmlData = jumlah;
        listPenduduk = new DataPenduduk[jumlah];
    }
    
    public void tambah(DataPenduduk P) {
        if (indeks<listPenduduk.length) {
            listPenduduk[indeks] = P;
            indeks++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < jmlData; i++) {
            if (listPenduduk[i].nik == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    
    public void Tampilposisi(int x, int pos)
    {
        if (pos != -1) {
            System.out.println("NIK              : " + x + " ditemukan pada indeks " + pos);
            System.out.println("Data Penduduk ke-" + (pos + 1));
            System.out.println("NIK Penduduk     : " + listPenduduk[pos].nik);
            System.out.println("Nama Penduduk    : " + listPenduduk[pos].nama);
            System.out.println("Alamat Penduduk  : " + listPenduduk[pos].alamat);
            System.out.println("Jenis Kelamin    : " + listPenduduk[pos].jenisK);
            System.out.println("===========================================================");
        }
        else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

}
