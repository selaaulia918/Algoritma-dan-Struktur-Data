/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) throws Exception {
        linkedLists data = new linkedLists();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Masukkan data : ");
            for (int i = 0; i < 12; i++) {
                System.out.print((i + 1) + "\t : ");
                double data1 = sc.nextDouble();
                System.out.print((i + 1) + "\t : ");
                double data2 = sc.nextDouble();
                System.out.print((i + 1) + "\t : ");
                double data3 = sc.nextDouble();
                System.out.println();
                data.add(data1, data2, data3);
            }
            System.out.println();
            System.out.println("\t 2018 \t\t 2019 \t\t 2020");
            data.print();
            data.clear();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
}
