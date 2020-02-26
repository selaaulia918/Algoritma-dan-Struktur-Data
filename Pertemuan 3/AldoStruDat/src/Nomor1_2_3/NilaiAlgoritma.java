/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1_2_3;

/**
 *
 * @author Asus
 */
public class NilaiAlgoritma {
    public String namaMhs;
    public int nilaiTugas;
    public int nilaiKuis;
    public int nilaiUTS;
    public int nilaiUAS;
    public double hitungTotalNilai(int tugas, int kuis, int UTS, int UAS){
        return (tugas * 0.3) + (kuis * 0.2) + (UTS * 0.2) + (UAS * 0.3);
    }
}
