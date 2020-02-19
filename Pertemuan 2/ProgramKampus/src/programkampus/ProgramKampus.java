/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programkampus;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class ProgramKampus {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       NilaiKampus nk = new NilaiKampus();
        System.out.println("=======PENILAIAN MAHASISWA=======");
	System.out.print("Masukkan jumlah mahasiswa : ");
	nk.jumlah = sc.nextInt();
        System.out.println("---------------------------------");
	NilaiKampus[] nilai = new NilaiKampus[nk.jumlah];
        for (int i = 0; i < nilai.length ; i++) {
	nilai[i] = new NilaiKampus();
        System.out.println("Mahasiswa ke-" + (i+1) + " : ");
        System.out.print("Masukkan Nilai ke 1 : ");
        nilai[i].nilai1 = sc.nextInt();
	System.out.print("Masukkan Nilai ke 2 : ");
	nilai[i].nilai2 = sc.nextInt();
	}
	System.out.println();
        for (int i = 0; i < nilai.length ; i++) {
	System.out.println("Nilai Terbaik Mahasiswa ke-" + (i+1) + " : " + nk.max(nilai[i].nilai1 , nilai[i].nilai2));
	}
    }

}
    
    

