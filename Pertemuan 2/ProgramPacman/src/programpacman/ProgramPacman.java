/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpacman;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class ProgramPacman {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pacman pac = new Pacman();

        pac.x = 0;
        pac.y = 0;

        System.out.println("===================Program PacMan==========================");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Note: ");
        System.out.println("1. Arah gerak Pacman adalah left, right, up, dan down");
        System.out.println("2. the game is over jika PacMan keluar area permainan");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Permainan dimulai");
        System.out.print("Masukkan Lebar area Permainan: ");
        pac.width = sc.nextInt();
        System.out.print("Masukkan Tinggi area Permainan: ");
        pac.height = sc.nextInt();
        pac.printPosition();
        System.out.println("Koordinat Awal PacMan: " + pac.x + "," + pac.y);
        sc.nextLine();
        for (int i = 0; i < 10;) {
            System.out.print("Gerakan PacMan: ");
            pac.arah = sc.nextLine();
            if (pac.arah.equalsIgnoreCase("left")) {
                pac.moveLeft();
            } else if (pac.arah.equalsIgnoreCase("right")) {
                pac.moveRight();
            } else if (pac.arah.equalsIgnoreCase("up")) {
                pac.moveUp();
            } else if (pac.arah.equalsIgnoreCase("down")) {
                pac.moveDown();
            } else {
                System.out.println("Gerakan Pacman Salah, The game is over");
            }
        }
    }
}
