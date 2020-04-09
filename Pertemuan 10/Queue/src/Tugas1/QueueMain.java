/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class QueueMain {

    public static void menu() {
        System.out.println("Pilih oprassi yang di ingingkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Scanner dafa = new Scanner(System.in);
        int choose;
        System.out.println("Masukkan Jumlah MAksimal Antrian ");
        int n = dafa.nextInt();
        Queue Q = new Queue(n);
        do {
            menu();
            choose = dafa.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Masukka data baru : "); 
                    int dataMasuk = dafa.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar
                            = Q.Dequeue();
                    if (dataKeluar
                            != 0) {
                        System.out.println("Data yang DiKeluarkan : " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:

                    Q.peek();
                    break;
                case 5:

                    Q.peekRear();
                    break;
                case 6:
                    System.out.println("Masukkan Posisi data yang anda cari: "); 
                    int cari = dafa.nextInt();
                Q.peekPosition(cari);
                    break;
                case 7:
                    System.out.print("Data pada Antrian: ");
                    int antri
                            = dafa.nextInt();
                    Q.peekAt(antri);
                    break;
            }
        } while (choose == 1 || choose == 2 || choose == 3 || choose == 4);
    }
}
