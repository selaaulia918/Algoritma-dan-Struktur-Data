/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

/**
 *
 * @author Asus
 */
public class MahasiswaBerprestasi {
    Mahasiswa ListMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < ListMhs.length) {
            ListMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa m : ListMhs) {
            m.tampil();
            System.out.println("---------------------------------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < ListMhs.length - 1; i++) {
            for (int j = 1; j < ListMhs.length - i; j++) {
                if (ListMhs[j].ipk > ListMhs[j - 1].ipk) {
                    Mahasiswa tmp = ListMhs[j];
                    ListMhs[j] = ListMhs[j - 1];
                    ListMhs[j - 1] = tmp;
                }
            }
        }
    }
   
    public int FindBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == ListMhs[mid].ipk) {
                System.out.println("Ditemukan Mahasiwa dengan IPK : " + ListMhs[mid].ipk);
                return (mid);
            } else if (ListMhs[mid].ipk > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
