/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor4;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Nomor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("=======Pemilihan Ketua BEM Tahun 2020=======");
        System.out.println("--------------------------------------------");
        System.out.println("Kandidat Ketua BEM : ");
        System.out.println("1. Haris");
        System.out.println("2. Dian");
        System.out.println("3. Rani");
        System.out.println("4. Bisma");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan jumlah suara : ");
        int jumlah = sc.nextInt();
        
        KetuaBEM kb = new KetuaBEM(jumlah);
        System.out.println("--------------------------------------------");
        System.out.println("Masukkan nomor kandidat");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < kb.jumlah; i++){
            System.out.print("suara ke-" + (i+1) + " : " );
            kb.suara[i] = sc.nextInt();
        }
        kb.pemilihan(0);
        System.out.print("Presiden BEM yang terpilih adalah : ");
        if(kb.a > kb.b && kb.a > kb.c && kb.a > kb.d){
            System.out.println("Haris");
        }
        else if(kb.b > kb.a && kb.b > kb.c && kb.b > kb.d){
            System.out.println("Bisma");
        }
        else if(kb.c > kb.a && kb.c > kb.b && kb.c > kb.d){
            System.out.println("Dian");
        }
        else if(kb.d > kb.a && kb.d > kb.b && kb.d > kb.c) {
            System.out.println("Rani");
        }
    }
}
