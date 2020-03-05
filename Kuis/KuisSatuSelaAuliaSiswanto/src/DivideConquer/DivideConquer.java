/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DivideConquer;

/**
 *
 * @author Asus
 */
public class DivideConquer {

    public static void divideconquer(int n, char source, char destination, char spare) {
        if (n > 1) {
            divideconquer((n - 1), source, spare, destination);
            System.out.println("pindah gelang " + n + " dari tower " + source + " ke tower " + destination);
            divideconquer((n - 1), spare, destination, source);
        } else {
            System.out.println("pindah 1 gelang dari tower " + source + " ke tower " + destination);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        divideconquer(n, 'A', 'C', 'B');
    }
}
