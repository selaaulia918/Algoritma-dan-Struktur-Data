/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Asus
 */
public class Fibonacci {

    public int FibonacciDC(int a) {
        if (a <= 1) {  // 0(1)
            return a; // 0(1)
        } else {
            return FibonacciDC(a - 1) + FibonacciDC(a - 2); // 0(1)
        }
    }
    public int FibonacciBF(int a){
        int b[]; // 0(1)
        b = new int[(int ) a + 2]; // 0(1)
        b[0] = 0; // 0(1)
        b[1] = 1; // 0(1)
        for (int i = 2; i<=a; i++){ // 0(n)
            b[i] = b[i-1] + b[i-2]; // 0(1)
        }
        return b [(int) a]; // 0(1)
    }
}
//1+1+1+1+1+1+1+(n x 1) + 1=
//8 + n =
// O (n)