/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslima;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class luasbidang {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String pilih;
        int i;
        System.out.println("============MENU===========");
        System.out.println("A. Luas Segitiga");
        System.out.println("B. Luas Segiempat");
        System.out.println("C. Luas Lingkaran");
        System.out.print("Menu yang Anda pilih : ");
        pilih = sc.nextLine();
        if (pilih.equalsIgnoreCase("A")){
            luasSegitiga();
        } else if (pilih.equalsIgnoreCase("B")){
            luasSegiempat();
        } else if (pilih.equalsIgnoreCase("C")){
            luasLingkaran();
        } else {
            System.out.println("Maaf menu yang Anda tidak tersedia");
        }
    }
    static void luasSegitiga(){
        Scanner sc = new Scanner (System.in);
        int rumus, a, b;
        System.out.print("Panjang alas    : ");
        a = sc.nextInt();
        System.out.print("Tinggi segitiga : ");
        b = sc.nextInt();
        rumus = 1 * a * b / 2;
        System.out.print("Luas Segitiga   : " + rumus);
    } static void luasSegiempat(){
        Scanner sc = new Scanner (System.in);
        int rumus, s;
        System.out.print("Pajang sisi : ");
        s = sc.nextInt();
        rumus = s * s;
            System.out.print("Luas segiempat : " + rumus);
    } static void luasLingkaran(){
        Scanner sc = new Scanner (System.in);
        double phi = 3.14, luas;
        int jari2;
        System.out.print("Panjang jari-jari : ");
        jari2 = sc.nextInt();
        luas = phi * jari2 * jari2;
        System.out.print("Luas Lingkaran : " + luas);
    }
    
} 
