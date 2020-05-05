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
public class DoubleLinkedListsMain {
    static Scanner input = new Scanner(System.in);
    static DoubleLinkedLists dll = new DoubleLinkedLists();

    public static void menu() {
        System.out.println("====================================================");
        System.out.println("                DOUBEL LINKED LISTS                 ");
        System.out.println("====================================================");
        System.out.println("|              M      E      N      U              |");
        System.out.println("----------------------------------------------------");      
        System.out.println("1.) Tambah awal");
        System.out.println("2.) Tambah akhir");
        System.out.println("3.) Tambah Data Indeks Tertentu");
        System.out.println("4.) Hapus awal");
        System.out.println("5.) Hapus akhir");
        System.out.println("6.) Hapus Indeks Tertentu");
        System.out.println("7.) Cetak Data");
        System.out.println("8.) Cari");
        System.out.println("9.) Keluar");        
        System.out.println("====================================================");
    }

    public static int select() {
        System.out.print("Menu yang Anda Pilih : ");
        int in = input.nextInt();
        System.out.println("----------------------------------------------------");
        return in;
    }

    public static void proses() throws Exception {
        menu();
        switch (select()) {
            case 1:
                System.out.print("Masukkan data : ");
                int news = input.nextInt();
                dll.addFirst(news);
                break;
            case 2:
                System.out.print("Masukkan data : ");
                int last = input.nextInt();
                dll.addLast(last);
                break;
            case 3:
                System.out.print("Masukkan data : ");
                int add = input.nextInt();
                System.out.print("Masukkan Posisi indeks data: ");
                int indeks = input.nextInt();
                dll.add(add, indeks);
                break;
            case 4:
                dll.removeFirst();
                break;
            case 5:
                dll.removeLast();
                break;
            case 6:
                System.out.print("Masukkan Indeks : ");
                int dell = input.nextInt();
                dll.remove(dell);
                break;
            case 7:
                dll.print();
                break;
            case 8:
                System.out.print(
                        "Masukkan data yang ingin dicari: ");
                int search = input.nextInt();
                dll.getValue(search);
                break;
            case 9:
                System.exit(0);
                break;
            default:
                proses();
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        proses();
    }
}
