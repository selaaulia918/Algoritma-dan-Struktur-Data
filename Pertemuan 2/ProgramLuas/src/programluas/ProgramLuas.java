/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programluas;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class ProgramLuas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Luas ls = new Luas();
        ls.control = 0;
        System.out.println("================JUAL BELI TANAH===============");
        System.out.print("Masukkan jumlah tanah : ");
        ls.jumlah = sc.nextInt();
        System.out.println("==============================================");
        Luas[] tanah = new Luas[ls.jumlah];
        for (int i = 0; i < tanah.length; i++) {
            tanah[i] = new Luas();

            System.out.print("Masukkan panjang Tanah ke-" + (i + 1) + " : ");
            tanah[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar Tanah ke-" + (i + 1) + " : ");
            tanah[i].lebar = sc.nextInt();
            System.out.println("----------------------------------------------");
        }
        System.out.println();

        for (int i = 0; i < tanah.length; i++) {
            System.out.println("Luas Tanah ke-" + (i + 1) + " : " + ls.luasTanah(tanah[i].panjang, tanah[i].lebar));
        }
        ls.max = ls.luasTanah(tanah[0].panjang, tanah[0].lebar);

        for (int i = 0; i < tanah.length; i++) {
            if (ls.luasTanah(tanah[i].panjang, tanah[i].lebar) > ls.max) {
                ls.max = ls.luasTanah(tanah[i].panjang, tanah[i].lebar);
                ls.control = i;
            }
        }
        System.out.println("Tanah yang terluas adalah tanah ke-" + (ls.control + 1));
        System.out.println("======TERIMA KASIH ATAS KEPERCAYAAN ANDA======");
    }

}
