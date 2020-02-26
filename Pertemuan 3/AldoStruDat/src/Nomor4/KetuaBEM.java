/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor4;

/**
 *
 * @author Asus
 */
public class KetuaBEM {
    public int jumlah, suara[], a, b, c, d;

    public KetuaBEM (int jumlah){
        this.jumlah = jumlah;
        this.suara = new int[jumlah];
    }
    int pemilihan(int e){
        if( e == jumlah){
            return 0;
        }
        else {
            switch (suara[e]) {
                case 1:
                    a+=1;
                    break;
                case 2:
                    b+=1;
                    break;
                case 3:
                    c+=1;
                    break;
                case 4:
                    d++;
                    break;
                default:
                    break;
            }
         return pemilihan(e+1);
        }
    }
}   