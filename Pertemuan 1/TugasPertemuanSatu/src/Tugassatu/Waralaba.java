/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugassatu;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Waralaba {
        
        static int harga;
        public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String paket, ayam, oke;
        int jumlah, total, uang, kembalian;
        System.out.println("=====DAFTAR PAKET====");
        System.out.println("A. Paket Chicken");
        System.out.println("B. Paket Oke");
        System.out.print("Paket yang Anda pilih : ");
        paket = sc.nextLine();
        if (paket.equalsIgnoreCase("A")){
            System.out.println("A. Chicken A Rp 12.000");
            System.out.println("B. Chicken B Rp 15.000");
            System.out.println("C. Chicken C Rp 20.000");
            System.out.print("Paket Chicken yang Anda pesan adalah : ");
            ayam = sc.nextLine();
            if (ayam.equalsIgnoreCase("A")){
                System.out.println("Chicken A  Rp 12.000");
                harga = 12000;
            } else if (ayam.equalsIgnoreCase("B")){
                System.out.println("Chicken B  Rp 15.000");
                harga = 15000;
            } else if (ayam.equalsIgnoreCase("C")){
                System.out.println("Chicken C  Rp 20.000");
                harga = 20000;
            } else {
                System.out.println("Maaf pilihan Anda tidak tersedia");
            }
        } else {
            System.out.println("A. Oke A Rp 10.000");
            System.out.println("B. Oke B Rp 12.000");
            System.out.println("C. Oke C Rp 15.000");
            System.out.print("Paket Oke yang Anda Pesan : ");
            oke = sc.nextLine();
            if (oke.equalsIgnoreCase("A")){
                System.out.println("Oke A  Rp 10.000");
                harga = 10000;
            } else if (oke.equalsIgnoreCase("B")){
                System.out.println("Oke B  Rp 12.000");
                harga = 12000;
            } else if (oke.equalsIgnoreCase("C")){
                System.out.println("Oke C Rp  15.000");
                harga = 15000;
            } else {
                System.out.println("Maaf pilihan Anda tidak tersedia");
            }
        } 
            System.out.println("---------------------------");
            System.out.print("Jumlah yang Anda Pesan : ");
            jumlah = sc.nextInt();
            total = harga * jumlah;
            System.out.println("Total Pembayaran : " + total);
            sc.nextLine();
            System.out.print("Uang Anda        : ");
            uang = sc.nextInt();
            kembalian = uang - total;
            System.out.print("Uang Kembalian   : " + kembalian);
            
    }
}
