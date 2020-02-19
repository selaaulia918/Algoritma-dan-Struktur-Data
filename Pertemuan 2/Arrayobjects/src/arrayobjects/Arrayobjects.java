/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjects;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Arrayobjects {
    public static void main(String[] args) {
        PersegiPanjang [] ppArray = new PersegiPanjang[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        } 
        for (int i = 0; i < 3; i++){
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang : " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
        }
    }
    
}
