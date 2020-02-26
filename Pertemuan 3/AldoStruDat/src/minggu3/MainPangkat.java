/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        Pangkat [] png = new Pangkat [elemen];
        
        for (int i =0; i< elemen; i++){
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" +(i+1)+" : ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("====================================================");
        System.out.println("-------------Pilih Cara Penyelesaian-----------------");
        System.out.println("A. Brute Force");
        System.out.println("B. Divide Conquer");
        System.out.print("Menu yang Anda pilih : ");
        String pilih = sc.next();
        if (pilih.equalsIgnoreCase("A")){
            System.out.println("-------------------------------------------------");
            System.out.println("Hasil Pangkat dengan Bruce Force");
                for (int i = 0; i < elemen; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+ " adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
            }
        } else {
            System.out.println("-------------------------------------------------");
            System.out.println("Hasil Pangkat dengan Divide and Coquer");
                for (int i = 0; i < elemen; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+ " adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
            }
        }
        System.out.println("====================================================");
    }
}
