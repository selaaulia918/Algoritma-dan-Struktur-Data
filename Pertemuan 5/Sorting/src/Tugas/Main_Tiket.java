/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Main_Tiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner (System.in);
        Tiket data = new Tiket();
        int jumTkt = 5;

        for (int i = 0; i < jumTkt; i++) {
            System.out.print("Nama Maskapai = ");
            String nama = sc1.nextLine();
            System.out.print("Harga Tiket = ");
            float harga = sc.nextFloat();
            System.out.print("Flight Time = ");
            int flightTime = sc.nextInt();
            System.out.print("Transit Count = ");
            int transitCount = sc.nextInt();
            System.out.println("--------------------------");
            
            Tiket ti = new Tiket(transitCount, nama, flightTime, harga);
            data.tambah(ti);
        }
        System.out.println("Data Tiket Bubble Sort");
        System.out.println("--------------------------------");
        data.bubbleSort();

        System.out.println("Data Tiket Selection Sort = ");
        System.out.println("--------------------------------");
        data.selectionSort();
       
    }    
}
