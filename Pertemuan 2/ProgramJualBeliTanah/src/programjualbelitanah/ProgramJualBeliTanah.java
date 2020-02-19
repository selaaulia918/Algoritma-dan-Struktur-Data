/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programjualbelitanah;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ProgramJualBeliTanah {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JualBeliTanah JBT = new JualBeliTanah();
        System.out.println("================JUAL BELI TANAH===============");
        System.out.print("Masukkan jumlah tanah : ");
        JBT.jumlah = sc.nextInt();
        System.out.println("==============================================");
        JualBeliTanah[] tanah = new JualBeliTanah[JBT.jumlah];

        for (int i = 0; i < tanah.length; i++) {
            tanah[i] = new JualBeliTanah();

            System.out.print("Masukkan panjang Tanah ke-" + (i + 1) + " : ");
            tanah[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar Tanah ke-" + (i + 1) + "   : ");
            tanah[i].lebar = sc.nextInt();
            System.out.println("----------------------------------------------");
        }
        for (int i = 0; i < tanah.length; i++) {
            System.out.println("Luas Tanah ke-" + (i + 1) + " : " + JBT.luasTanah(tanah[i].panjang, tanah[i].lebar));
        }
        System.out.println("======TERIMA KASIH ATAS KEPERCAYAAN ANDA======");
    }

}
