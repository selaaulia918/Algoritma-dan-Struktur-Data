/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MainFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 0(1)
        Fibonacci f = new Fibonacci(); // 0(1)
        System.out.println("=============FIBONACCI============"); // 0(1)
        System.out.print("Masukkan banyak range: "); // 0(1)
        int a = sc.nextInt(); // 0(1)

        System.out.println("=======Cara Penyelesaian=========="); // 0(1)
        System.out.println("A. Bruce Force"); // 0(1)
        System.out.println("B. Divide Conquer"); // 0(1)
        System.out.print("Cara yang Anda pilih : "); // 0(1)
        String pilih = sc.next(); // 0(1)
        System.out.println("----------------------------------"); // 0(1)
        if (pilih.equalsIgnoreCase("A")) { // 0(1)
            for (int i = 0; i < a; i++) { // 0(n)
                System.out.println("Fibonacci " + f.FibonacciBF(i)); // 0(1)
            }
        } else {
            for (int i = 0; i < a; i++) { // 0(n)
                System.out.println("Fibonacci " + f.FibonacciDC(i)); // 0(1)
            }
        }
    }
}
//1+1+1+1+1+1+1+1+1+1+1+1+(n x 1) + (n x 1) =
// 12 + 2n =
// 2n =
// O(n)