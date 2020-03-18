/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Asus
 */
public class LigaInggris {
    public String nama;
    public int p;
    public int gd;
    public int pts;
    LigaInggris list[] = new LigaInggris[20];
    LigaInggris li ;
    int id;

    public LigaInggris(String nama, int p, int gd, int pts) {
        this.nama = nama;
        this.p = p;
        this.gd = gd;
        this.pts = pts;
    }

    public LigaInggris() {
    }
    
    public void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Pelanggaran = "+p);
        System.out.println("Gol = "+gd);
        System.out.println("Poin = "+pts);
    }
    
    public void tambah(LigaInggris lg){
        if (id<list.length) {
            list[id] = lg;
            id++;
        }else{
        //    System.out.println("Data sudah penuh!!");
        }
    }
    public void insertionSort(){
        int i,j;
        for (i = 1; i < list.length; i++) {
            LigaInggris ling = new LigaInggris();
            ling = list[i];
            j=i ;
            while((j>0) && (list[j-1].pts > ling.pts)){
                list[j] = list[j-1];
                j--;
            }
            list[j] = ling;
        }
        for(LigaInggris l : list){
            l.tampil();
            System.out.println("------------------------------");
        }
    }
    
    public void insertionSortds(){
        int i,j;
        for (i = 1; i < list.length; i++) {
            LigaInggris ling = new LigaInggris();
            ling = list[i];
            j=i ;
            while((j>0) && (list[j-1].pts < ling.pts)){
                list[j] = list[j-1];
                j--;
            }
            list[j] = ling;
        }
        for(LigaInggris l : list){
            l.tampil();
            System.out.println("------------------------------");
        }
    }
}
