/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BrufeForce;

/**
 *
 * @author Asus
 */
public class BruteForce {
    public static void bruteforce(char[] text, char[] pola) {
        int j;
        int cek = 0;
        for (int i = 0; i <= text.length - pola.length; i++) {
            j = 0;
            while (j < pola.length && text[i + j] == pola[j]) {
                j++;
            }
            if (j >= pola.length) {
                cek++;
            }
        }
        if (cek > 0) {
            System.out.println("DATA COCOK");
        } else {
            System.out.println("DATA TIDAK COCOK");
        }
    }

    public static void main(String[] args) {
        char[] x = {'N', 'G', 'A'};
        char[] y = {'S', 'E', 'M', 'A', 'N', 'G', 'A', 'T'};
        bruteforce(y, x);
    }
}
