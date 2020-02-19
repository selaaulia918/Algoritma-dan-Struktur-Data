/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programjajargenjang;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class ProgramJajarGenjang {
    public static void main(String[] args) {
        JajarGenjang[] jg = new JajarGenjang[5];
        Scanner sc = new Scanner (System.in);
        
        System.out.println("=======================================");
        System.out.println("   LUAS DAN KELILING JAJAR GENJANG     ");
        System.out.println("=======================================");
        for (int i = 0; i < 5; i++ ){
            jg[i] = new JajarGenjang();
            System.out.println("Hitung luas dan keliling ke " + (i+1));
            System.out.println("------------------------------------");
            System.out.print("Masukkan panjang alas ke " + (i+1)+ " : ");
            jg[i].alas = sc.nextInt();
            System.out.print("Masukkan tinggi ke " + (i+1)+ " : ");
            jg[i].tinggi = sc.nextInt();
            System.out.print("Masukkan sisi miring ke " + (i+1)+ " : ");
            jg[i].sisiMiring = sc.nextInt();
            System.out.println("-------------------------------------");
            System.out.println("Luas Jajar Genjang ke " + (i+1) + " : " + jg[i].hitungLuas());
            System.out.println("Keliling Jajar Genjang ke " + (i+1) + " : " + jg[i].hitungKeliling());
            System.out.println("=====================================");
        }
   
    }
    
}
