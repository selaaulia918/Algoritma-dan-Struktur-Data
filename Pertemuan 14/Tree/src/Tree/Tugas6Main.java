/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Tugas6Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeArray bta = new BinaryTreeArray();
        
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        int value, a;
        
        for(int i = 0; i < data.length; i++){
            System.out.print(" Masukkan data : ");
            data[i] = sc.nextInt();
            bta.add(data[i]);
            System.out.println("------------------------------------------------");
        }
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
        System.out.println("");
        bta.traversePostOrder(0);
        System.out.println("");
        bta.traversePreOrder(0);
        System.out.println("");
    }
}
