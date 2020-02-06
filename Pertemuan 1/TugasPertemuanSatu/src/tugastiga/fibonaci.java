/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugastiga;

/**
 *
 * @author Asus
 */
public class fibonaci {
    public static void main(String[] args){
        char[] huruf = {'M', 'I', 'S', 'S', 'I', 'S', 'S', 'I', 'P', 'I'};
        int M = 0, I = 0, S = 0, P = 0;
        for (int i=0; i<huruf.length; i++){
            if (huruf[i] == 'M') M++;
        }
        System.out.println("Jumlah M pada kalimat tersebut adalah : " + M);
        for (int j=0; j<huruf.length; j++){
            if (huruf[j] == 'I') I++;
        } 
        System.out.println("Jumlah I pada kalimat tersebut adalah : " + I);
        for (int k=0; k<huruf.length; k++){
            if (huruf[k] == 'S') S++;
        } 
        System.out.println("Jumlah S pada kalimat tersebut adalah : " + S);
        for (int l=0; l<huruf.length; l++){
            if (huruf[l] == 'P') P++;
        } 
        System.out.println("Jumlah P pada kalimat tersebut adalah : " + P);
    } 
}
