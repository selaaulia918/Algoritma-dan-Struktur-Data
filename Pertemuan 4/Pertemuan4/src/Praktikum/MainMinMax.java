/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import static Praktikum.MinMax.max_min;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MainMinMax {

    public static void main(String[] args) {
        //TODO code application logic here
        MinMax[] ppArray = new MinMax[5]; // 0(1)
        ppArray[0] = new MinMax(); // 0(1)

        Scanner sc = new Scanner(System.in); // 0(1)
        for (int i = 0; i < 5; i++) { // 0(n)
            ppArray[i] = new MinMax(); // 0(1)
            System.out.println("Nilai Array indeks ke-" + i); // 0(1)
            System.out.print("Masukkan nilai : "); // 0(1)
            ppArray[i].nilaiArray = sc.nextInt(); // 0(1)
        }
        int min = ppArray[0].nilaiArray; // 0(1)
        int max = ppArray[0].nilaiArray; // 0(1)
        for (int l = 0; l < 5; l++) { // 0(n)
            if (ppArray[l].nilaiArray < min) { // 0(1)
                min = ppArray[l].nilaiArray; // 0(1)
            } else if (ppArray[l].nilaiArray > max) { // 0(1)
                max = ppArray[l].nilaiArray; // 0(1)
            }
        }
        System.out.println("Brute Force"); // 0(1)
        System.out.println("Nilai minimal  : " + min); // 0(1)
        System.out.println("Nilai maksimal : " + max); // 0(1)
        
        int arr[] = new int[5];// 0(1)
        for (int i = 0; i < 5; i++){ // 0(n)
            arr[i] = ppArray[i].nilaiArray ; // 0(1)
        }
        Maxmin hasil = new Maxmin(); // 0(1)
        
        max_min(arr, 0, 4, hasil);// 0(1)
        System.out.println("Divide Conquer");// 0(1)
        System.out.print("Nilai minimal : " + hasil.minimum + "\nNilai Maksimaly : "+hasil.maximum);// 0(1)
        System.out.println("\n");// 0(1)
    } 
}
// 1+1+1+(nx1x1x1)+1+1+(nx1x1x1x1)+1+1+1+1+(nx1)+1+1+1+1+1 =
// 3 + n + 2 + n + 4 + n + 5 =
// 14 + 3n =
// O(n)
