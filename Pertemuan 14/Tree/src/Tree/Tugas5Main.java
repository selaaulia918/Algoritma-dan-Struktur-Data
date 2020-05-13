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
public class Tugas5Main {

    public static void menu() {
        System.out.println("====================================================");
        System.out.println("|                        MENU                      |");
        System.out.println("====================================================");
        System.out.println("| 1. Add                                           |");
        System.out.println("| 2. Delete                                        |");
        System.out.println("| 3. Find                                          |");
        System.out.println("| 4. Traverse InOrder                              |");
        System.out.println("| 5. Traverse PreOrder                             |");
        System.out.println("| 6. Traverse PostOrder                            |");
        System.out.println("| 0. Exit                                          |");
        System.out.println("====================================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        int pilih;

        do {
            menu();
            System.out.print("Pilihan Anda : ");
            pilih = sc.nextInt();
            System.out.println("----------------------------------------------------");

            try {
                switch (pilih) {
                    case 1:
                        System.out.print("Masukkan data : ");
                        int data = sc.nextInt();
                        bt.add(data);
                        break;

                    case 2:
                        System.out.print("Masukkan data : ");
                        int data1 = sc.nextInt();
                        bt.delete(data1);
                        break;

                    case 3:
                        System.out.print("Masukkan data : ");
                        int data2 = sc.nextInt();
                        System.out.println("Find " + bt.find(data2));
                        break;

                    case 4:
                        bt.traverseInOrder(bt.root);
                        break;

                    case 5:
                        bt.traversePreOrder(bt.root);
                        break;

                    case 6:
                        bt.traversePostOrder(bt.root);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3
                || pilih == 4 || pilih == 5 || pilih == 6);
        System.out.println("====================================================");
        System.out.println("|        TERIMA KASIH ATAS KEPERCAYAAN ANDA        |");
        System.out.println("====================================================");
    }
}
