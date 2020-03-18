/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Asus
 */
public class Tiket {

    public int transitCount;
    public String maskapai;
    public int flightTime;
    public float harga;
    Tiket ListTiket[] = new Tiket[5];
    int idx;

    public Tiket(int t, String n, int f, float h) {
        this.harga = h;
        this.maskapai = n;
        this.flightTime = f;
        this.transitCount = t;
    }

    public Tiket() {

    }

    public void tampil() {
        System.out.println("Nama Maskapai = " + maskapai);
        System.out.println("Harga Tiket = " + harga);
        System.out.println("Flight Time = " + flightTime);
        System.out.println("Transit Count = " + transitCount);
    }

    void tambah(Tiket t) {
        if (idx < ListTiket.length) {
            ListTiket[idx] = t;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < ListTiket.length - 1; i++) {
            for (int j = 1; j < ListTiket.length - i; j++) {
                if (ListTiket[j].harga < ListTiket[j - 1].harga) {
                    Tiket tik = ListTiket[j];
                    ListTiket[j] = ListTiket[j - 1];
                    ListTiket[j - 1] = tik;
                }
            }
        }
        for (Tiket t : ListTiket) {
            t.tampil();
            System.out.println("---------------------------");
        }
    }

    void selectionSort() {
        for (int i = 0; i < ListTiket.length - 1; i++) {
            int Min = i;
            for (int j = i + 1; j < ListTiket.length; j++) {
                if (ListTiket[j].harga < ListTiket[Min].harga) {
                    Min = j;
                }
            }
            Tiket tkt = ListTiket[Min];
            ListTiket[Min] = ListTiket[i];
            ListTiket[i] = tkt;
        }
        for (Tiket t : ListTiket) {
            t.tampil();
            System.out.println("---------------------------");
        }
    }
}
