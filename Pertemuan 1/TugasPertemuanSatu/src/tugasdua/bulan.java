/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdua;

/**
 *
 * @author Asus
 */
public class bulan {
    public static void main(String[] args){
        double uang = 1000000, bunga = 0.02, bulan;
        System.out.println("Saldo awal  = Rp 1.000.000");
        System.out.println("Saldo akhir = Rp 1.500.000");
        System.out.println("--------------------------");
        for (bulan = 0; uang< 1500000; bulan++){
            uang = uang + uang * bunga;
        }
        System.out.println("Jumlah Bulan = " + bulan);
        System.out.println("Total uang   = " + uang);
    }
}
