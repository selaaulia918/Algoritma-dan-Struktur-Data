/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Asus
 */
public class Stack {
    public int size;
    public int top;
    public String kalimat = "";
    public String kata[] = new String[10];

    public Stack(String kalimat) {
        this.kalimat = kalimat;
        size = kalimat.length();
        top = -1;
    }

    public void push(String hasil) {
        top++;
        kata[top] = hasil;
    }

    public String pop(int top) {
        String hasil = kata[top];
        top--;
        return hasil;
    }

    public void exchange() {
        String hasil = "";
        for (int i = 0; i < size; i++) {
            hasil += String.valueOf(kalimat.charAt(i));
            if(kalimat.charAt(i)==' '){
                push(hasil);
                hasil = "";
            }
        }
        push(hasil);
    }

    public void show() {
        String hasil = "";

        for (int i = top; i >= 0; i--) {
            hasil += pop(i) + " ";
        }
        System.out.println("Kalimat dibalik  : ");
        System.out.println(hasil);
    }
}
