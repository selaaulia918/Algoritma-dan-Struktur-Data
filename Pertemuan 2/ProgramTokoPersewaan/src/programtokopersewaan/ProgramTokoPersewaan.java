/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programtokopersewaan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ProgramTokoPersewaan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("=========Toko Persewaan Video Game==========");
        System.out.println("--------------------------------------------");
        TokoPersewaan tk = new TokoPersewaan();
        TokoPersewaan[] sewa = new TokoPersewaan[2];
        sewa[0] = new TokoPersewaan();
        sewa[0].id = 1487;
        sewa[0].game = "Batman Lego";
        sewa[0].harga = 3000;
        sewa[1] = new TokoPersewaan();
        sewa[1].id = 1458;
        sewa[1].game = "God Of War";
        sewa[1].harga = 5000;

        System.out.print("Masukkan nama anda : ");
        tk.nama = sc.nextLine();
        System.out.println("============================================");
        System.out.println("Game");
        for (int i = 0; i < sewa.length; i++) {
            System.out.println((i + 1) + ".) " + sewa[i].game);
        }
        System.out.println("============================================");
        System.out.print("Masukkan pilihan : ");
        tk.select = sc.nextInt();
        if (tk.select > 0 && tk.select <= (sewa.length)) {
            System.out.print("Sewa berapa hari : ");
            tk.hari = sc.nextInt();
            System.out.println("============================================");
            System.out.println("\nData : ");
            System.out.println("id\t\t = " + sewa[(tk.select - 1)].id);
            System.out.println("Nama\t\t = " + tk.nama);
            System.out.println("Game\t\t = " + sewa[(tk.select - 1)].game);
            System.out.println("Lama Pinjam\t = " + tk.hari + " Hari ");
            System.out.println("Harga\t\t = " + (sewa[(tk.select - 1)].harga * tk.hari));
        } else {
            System.exit(0);
        }
        System.out.println("======Terima Kasih Atas Kunjungan Anda=====");
    }
}
