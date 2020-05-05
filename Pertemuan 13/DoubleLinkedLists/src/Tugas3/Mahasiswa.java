/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Asus
 */
public class Mahasiswa {

    int nilai;
    String nama;
    Mahasiswa prev;
    Mahasiswa next;

    Mahasiswa(Mahasiswa prev, int nilai, String nama, Mahasiswa next) {
        this.prev = prev;
        this.nilai = nilai;
        this.next = next;
        this.nama = nama;
    }
}
