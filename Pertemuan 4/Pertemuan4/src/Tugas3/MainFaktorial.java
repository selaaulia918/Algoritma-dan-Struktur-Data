/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class MainFaktorial {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in); // 0(1)
        System.out.println("====================================================");// 0(1)
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");// 0(1)
        int elemen = sc.nextInt();// 0(1)
        Faktorial [] fk = new Faktorial[elemen];// 0(1)
        for (int i = 0; i < elemen; i++){ // 0(n)
            fk[i] =  new Faktorial(); // 0(1)
            System.out.print("Masukkan nilai data ke-" + (i+1) +" : "); // 0(1)
            fk[i].nilai = sc.nextInt(); // 0(1)
        }
        System.out.println("===================================================="); // 0(1)
        System.out.println("Hasil Faktorial dengan Brute Force"); // 0(1)
        double start = System.nanoTime(); // 0(1)
        for (int i =0; i < elemen; i++){ // 0(n)
            System.out.println("Faktorial dari nilai " +fk[i].nilai+"adalah : "+fk[i].faktorialBF(fk[i].nilai)); // 0(1)
        } 
        double finish = System.nanoTime(); // 0(1)
        System.out.println("Durasi eksekusi : " + (finish - start)); // 0(1)
        System.out.println("===================================================="); // 0(1)
        System.out.println("Hasil Faktorial dengan Divide and Conquer"); // 0(1)
        start = System.nanoTime(); // 0(1)
        for (int i = 0; i < elemen; i++){ // 0(n)
            System.out.println("Faktorial dari nilai " +fk[i].nilai+"adalah : "+fk[i].faktorialDC(fk[i].nilai)); // 0(1)
        }
        finish = System.nanoTime(); // 0(1)
        System.out.println("Durasi eksekusi : " + (finish - start)); // 0(1)
        System.out.println("===================================================="); // 0(1)
    }
}
// 1+1+1+1+1+(nx1x1x1)+1+1+1+(nx1)+1+1+1+1+1+(nx1)+1+1+1 =
// 5 + n + 3 + n + 5 + n + 3 =
// 16 + 3n =
// 3n
// O(n)