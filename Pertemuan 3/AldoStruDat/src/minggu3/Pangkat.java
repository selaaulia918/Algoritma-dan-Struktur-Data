/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

/**
 *
 * @author Asus
 */
public class Pangkat {
    public int nilai, pangkat;

    public int pangkatBF(int a, int n){
        int hasil=1;
        for (int i=0; i < n; i++){
        hasil = hasil * a;
        }
        return hasil;
    }
    public int pangkatDC(int a, int n){
        if (n==0){
            return 1;
        } else {
            if (n%2==1){//Bilangan Ganjil
                return (pangkatDC(a,n/2) * pangkatDC (a,n/2)*a);
            } else { //Bilangan Genap
                return (pangkatDC(a,n/2) * pangkatDC (a,n/2));
            }
        } 
    }
    public Pangkat(){
        
    }
    public Pangkat(int nilai, int pangkat){
        this.nilai = nilai;
        this.pangkat = pangkat;
    }
}

